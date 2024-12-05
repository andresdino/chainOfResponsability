package com.example.chainOfResponsability.dto;

import lombok.*;

import java.util.List;


public class ResultDTO {
    private String status;
    private List<Document> documents;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Document> getDocuments() {
        return documents;
    }

    public void setDocuments(List<Document> documents) {
        this.documents = documents;
    }

    public static class Document {
        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getFilename() {
            return filename;
        }

        public void setFilename(String filename) {
            this.filename = filename;
        }

        public String getPrefix() {
            return prefix;
        }

        public void setPrefix(String prefix) {
            this.prefix = prefix;
        }

        private String type;
        private String filename;
        private String prefix;
    }
}
