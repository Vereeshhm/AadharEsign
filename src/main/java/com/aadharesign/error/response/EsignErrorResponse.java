package com.aadharesign.error.response;

import com.aadharesign.utils.EsignResponse;

public class EsignErrorResponse {
	
	public static EsignResponse returnBadRequest() {
		EsignResponse esignResponse = new EsignResponse();
		esignResponse.setStatus("FAILUER");
		esignResponse.setMessage("Esign Request should not be null");
		return esignResponse;
		
	}
	
	public static EsignResponse returnInternalServerErrorResponse(Exception e) {
		EsignResponse esignResponse = new EsignResponse();
		esignResponse.setStatus(e.getMessage());
		esignResponse.setMessage("Internal Server Error Response.!!!");
		return null;
		
	}

}
