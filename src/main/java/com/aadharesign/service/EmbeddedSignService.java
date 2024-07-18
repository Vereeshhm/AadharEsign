package com.aadharesign.service;

import com.aadharesign.utils.EsignRequest;
import com.aadharesign.utils.EsignResponse;

public interface EmbeddedSignService {
	
	public EsignResponse fetchEmbeddedEsign(EsignRequest esignRequest);

}
