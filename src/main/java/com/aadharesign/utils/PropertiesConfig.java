package com.aadharesign.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("file:src/main/resources/application.properties")
public class PropertiesConfig {

	@Value("${AppName}")
	private String appName;

	@Value("${SecretKey}")
	private String SecretKey;

	@Value("${LoginUrl}")
	private String loginUrl;

	@Value("${LoginToken}")
	private String loginToken;

	@Value("${EmbeddedEsignUrl}")
	private String embeddedEsignUrl;

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getSecretKey() {
		return SecretKey;
	}

	public void setSecretKey(String secretKey) {
		SecretKey = secretKey;
	}

	public String getLoginUrl() {
		return loginUrl;
	}

	public void setLoginUrl(String loginUrl) {
		this.loginUrl = loginUrl;
	}

	public String getLoginToken() {
		return loginToken;
	}

	public void setLoginToken(String loginToken) {
		this.loginToken = loginToken;
	}

	public String getEmbeddedEsignUrl() {
		return embeddedEsignUrl;
	}

	public void setEmbeddedEsignUrl(String embeddedEsignUrl) {
		this.embeddedEsignUrl = embeddedEsignUrl;
	}

}
