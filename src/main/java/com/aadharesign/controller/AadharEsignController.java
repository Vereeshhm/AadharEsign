package com.aadharesign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aadharesign.error.response.EsignErrorResponse;
import com.aadharesign.service.AadharEsignService;
import com.aadharesign.service.EmbeddedSignService;
import com.aadharesign.utils.EsignRequest;
import com.aadharesign.utils.EsignResponse;
import com.aadharesign.utils.LoginRequest;

@RestController
@RequestMapping("/saswat")
public class AadharEsignController {

	@Autowired
	AadharEsignService aadharEsignService;

	@Autowired
	EmbeddedSignService embeddedSignService;

	@PostMapping(value = "/validate_login", produces = MediaType.APPLICATION_JSON_VALUE)
	public String getAuthToken(@RequestBody LoginRequest loginRequest) {
		return aadharEsignService.fetchAuthToken(loginRequest);

	}

	@PostMapping(value = "/initiate_embedded_signing", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<EsignResponse> getEmbeddedSign(@RequestBody EsignRequest esignRequest) {
		if (!esignRequest.toString().isEmpty()) {
			EsignResponse esignResponse = embeddedSignService.fetchEmbeddedEsign(esignRequest);
			return new ResponseEntity<>(esignResponse, HttpStatus.OK);
		}
		return new ResponseEntity<>(EsignErrorResponse.returnBadRequest(), HttpStatus.BAD_REQUEST);
	}
}
