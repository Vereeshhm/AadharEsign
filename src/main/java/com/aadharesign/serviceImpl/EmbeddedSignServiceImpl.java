package com.aadharesign.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.aadharesign.error.response.EsignErrorResponse;
import com.aadharesign.service.EmbeddedSignService;
import com.aadharesign.utils.EsignRequest;
import com.aadharesign.utils.EsignResponse;
import com.aadharesign.utils.PropertiesConfig;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

@Service
public class EmbeddedSignServiceImpl implements EmbeddedSignService {

	@Autowired
	PropertiesConfig propertiesConfig;

	@Autowired
	RestTemplate restTemplate;

	@Override
	public EsignResponse fetchEmbeddedEsign(EsignRequest esignRequest) {

		// long timestamp = System.currentTimeMillis();
		EsignResponse esignResponse = new EsignResponse();
		String requestPacket = null;
		String Response = null;
		try {
			System.out.println(esignRequest);
			Gson gson = new Gson();
			requestPacket = gson.toJson(esignRequest);
			System.out.println(requestPacket);

			HttpHeaders headers = new HttpHeaders();
			headers.set("Authorization", propertiesConfig.getLoginToken());
			headers.set("Content-Type", "application/json");

			System.out.println("headers are " + headers);

			HttpEntity<Object> requestEntity = new HttpEntity<>(esignRequest, headers);
			System.out.println(requestEntity);
			Response = restTemplate.postForObject(propertiesConfig.getEmbeddedEsignUrl(), requestEntity, String.class);
			ObjectMapper objectMapper = new ObjectMapper();
            JsonNode jsonNode = objectMapper.readTree(Response);
            String isSuccess = jsonNode.get("IsSuccess").asText();
			if (!Response.isEmpty()) {
				esignResponse.setStatus(isSuccess);
				esignResponse.setMessage(Response);
			} else {
				esignResponse.setStatus("FAILUER");
				esignResponse.setMessage("something went wrong");
			}

		} catch (Exception e) {
			esignResponse = EsignErrorResponse.returnInternalServerErrorResponse(e);
			return esignResponse;

		}
		return esignResponse;
	}

}
