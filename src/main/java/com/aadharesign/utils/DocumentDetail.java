package com.aadharesign.utils;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class DocumentDetail {
    @JsonProperty("DocumentName")
    private String documentName;

    @JsonProperty("FileData")
    private String fileData;

    @JsonProperty("ControlDetails")
    private List<ControlDetail> controlDetails;

    // Constructor, getters, and setters
    public DocumentDetail() {
    }

    public DocumentDetail(String documentName, String fileData, List<ControlDetail> controlDetails) {
        this.documentName = documentName;
        this.fileData = fileData;
        this.controlDetails = controlDetails;
    }

    public String getDocumentName() {
        return documentName;
    }

    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    public String getFileData() {
        return fileData;
    }

    public void setFileData(String fileData) {
        this.fileData = fileData;
    }

    public List<ControlDetail> getControlDetails() {
        return controlDetails;
    }

    public void setControlDetails(List<ControlDetail> controlDetails) {
        this.controlDetails = controlDetails;
    }
}
