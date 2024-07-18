package com.aadharesign.utils;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class EsignRequest {
    @JsonProperty("Name")
    private String name;

    @JsonProperty("EmailId")
    private String emailId;

    @JsonProperty("RedirectURL")
    private String redirectURL;

    @JsonProperty("SignatoryEmailIds")
    private List<String> signatoryEmailIds;

    @JsonProperty("lstDocumentDetails")
    private List<DocumentDetail> lstDocumentDetails;

    // Constructor, getters, and setters
    public EsignRequest() {
    }

    public EsignRequest(String name, String emailId, String redirectURL, List<String> signatoryEmailIds, List<DocumentDetail> lstDocumentDetails) {
        this.name = name;
        this.emailId = emailId;
        this.redirectURL = redirectURL;
        this.signatoryEmailIds = signatoryEmailIds;
        this.lstDocumentDetails = lstDocumentDetails;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getRedirectURL() {
        return redirectURL;
    }

    public void setRedirectURL(String redirectURL) {
        this.redirectURL = redirectURL;
    }

    public List<String> getSignatoryEmailIds() {
        return signatoryEmailIds;
    }

    public void setSignatoryEmailIds(List<String> signatoryEmailIds) {
        this.signatoryEmailIds = signatoryEmailIds;
    }

    public List<DocumentDetail> getLstDocumentDetails() {
        return lstDocumentDetails;
    }

    public void setLstDocumentDetails(List<DocumentDetail> lstDocumentDetails) {
        this.lstDocumentDetails = lstDocumentDetails;
    }
}
