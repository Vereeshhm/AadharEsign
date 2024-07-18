package com.aadharesign.utils;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ControlDetail {
    @JsonProperty("PageNo")
    private int pageNo;

    @JsonProperty("SearchText")
    private String searchText;

    @JsonProperty("ControlID")
    private int controlId;

    @JsonProperty("Anchor")
    private String anchor;

    @JsonProperty("AssignedTo")
    private int assignedTo;

    @JsonProperty("Left")
    private int left;

    @JsonProperty("Top")
    private int top;

    @JsonProperty("Height")
    private int height;

    @JsonProperty("Width")
    private int width;

    // Constructor, getters, and setters
    public ControlDetail() {
    }

    public ControlDetail(int pageNo, String searchText, int controlId, String anchor, int assignedTo, int left, int top, int height, int width) {
        this.pageNo = pageNo;
        this.searchText = searchText;
        this.controlId = controlId;
        this.anchor = anchor;
        this.assignedTo = assignedTo;
        this.left = left;
        this.top = top;
        this.height = height;
        this.width = width;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public String getSearchText() {
        return searchText;
    }

    public void setSearchText(String searchText) {
        this.searchText = searchText;
    }

    public int getControlId() {
        return controlId;
    }

    public void setControlId(int controlId) {
        this.controlId = controlId;
    }

    public String getAnchor() {
        return anchor;
    }

    public void setAnchor(String anchor) {
        this.anchor = anchor;
    }

    public int getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(int assignedTo) {
        this.assignedTo = assignedTo;
    }

    public int getLeft() {
        return left;
    }

    public void setLeft(int left) {
        this.left = left;
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
