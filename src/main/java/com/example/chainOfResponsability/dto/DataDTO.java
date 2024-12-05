package com.example.chainOfResponsability.dto;

import lombok.*;


public class DataDTO {
    private int fileSize;
    private String bucketChannel;
    private String bucketService;
    private String pathFile;
    private String receiveTime;
    private String country;
    private String transactionId;
    private String fileName;
    private String busFlow;
    private String service;
    private String channel;
    private String company;
    private String account;
    private String documentStorageId;

    public int getFileSize() {
        return fileSize;
    }

    public void setFileSize(int fileSize) {
        this.fileSize = fileSize;
    }

    public String getBucketChannel() {
        return bucketChannel;
    }

    public void setBucketChannel(String bucketChannel) {
        this.bucketChannel = bucketChannel;
    }

    public String getBucketService() {
        return bucketService;
    }

    public void setBucketService(String bucketService) {
        this.bucketService = bucketService;
    }

    public String getPathFile() {
        return pathFile;
    }

    public void setPathFile(String pathFile) {
        this.pathFile = pathFile;
    }

    public String getReceiveTime() {
        return receiveTime;
    }

    public void setReceiveTime(String receiveTime) {
        this.receiveTime = receiveTime;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getBusFlow() {
        return busFlow;
    }

    public void setBusFlow(String busFlow) {
        this.busFlow = busFlow;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getDocumentStorageId() {
        return documentStorageId;
    }

    public void setDocumentStorageId(String documentStorageId) {
        this.documentStorageId = documentStorageId;
    }
}
