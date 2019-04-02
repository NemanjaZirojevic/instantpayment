package com.jwt.demo.entities;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Class representing an answer to activation request.")
public class ActivationResponse {
    @ApiModelProperty(notes = "Message sent to client", example = "success!", required = true, position = 0)
    private String message;
    @ApiModelProperty(notes = "Unique terminal id", example = "KCE00192223", required = true, position = 1)
    private String tid;
    @ApiModelProperty(notes = "Status code", example = "00", required = true, position = 2)
    private int statusCode;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    @Override
    public String toString() {
        return "ActivationResponse{" +
                "message='" + message + '\'' +
                ", statusCode=" + statusCode +
                '}';
    }
}
