package com.aadharesign.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.aadharesign.service.AadharEsignService;
import com.aadharesign.utils.LoginRequest;
import com.aadharesign.utils.PropertiesConfig;

@Service
public class AadharEsignServiceImpl implements AadharEsignService {

	@Autowired
	PropertiesConfig propertiesConfig;

	@Autowired
	RestTemplate restTemplate;

	@Override
	public String fetchAuthToken(LoginRequest loginRequest) {

		// long timestamp = System.currentTimeMillis();
		String Response = null;
		try {
			// Gson gson = new Gson();
			// String requestPacket = gson.toJson(loginRequest);

			HttpHeaders headers = new HttpHeaders();
			headers.set("SecretKey", propertiesConfig.getSecretKey());
			headers.set("AppName", propertiesConfig.getAppName());
			headers.set("Content-Type", "application/json");

			System.out.println(headers);

			HttpEntity<Object> requestEntity = new HttpEntity<>(loginRequest, headers);
			Response = restTemplate.postForObject(propertiesConfig.getLoginUrl(), requestEntity, String.class);

		} catch (Exception e) {
			// TODO: handle exception
		}
		return Response;
	}

}
