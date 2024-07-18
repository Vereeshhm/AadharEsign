package com.aadharesign.service;

import com.aadharesign.utils.LoginRequest;

public interface AadharEsignService {
	
	public String fetchAuthToken(LoginRequest loginRequest);

}
