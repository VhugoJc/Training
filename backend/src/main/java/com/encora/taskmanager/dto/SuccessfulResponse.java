package com.encora.taskmanager.dto;

public class SuccessfulResponse {
    private int status;
    private String message;
    // Constructors
    public SuccessfulResponse(int status, String message) {
        this.status = status;
        this.message = message;
    }
    // Getters and setters
    public int getStatus() {
        return status;
    }
    public void setStatus(int status) {
        this.status = status;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

}
