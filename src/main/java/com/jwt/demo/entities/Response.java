package com.jwt.demo.entities;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Class representing a response to customer's operation")
public class Response {
    @ApiModelProperty(notes = "Response message", example = "Success!", required = true, position = 0)
    private String message;
    @ApiModelProperty(notes = "Status code", example = "200", required = true, position = 1)
    private int errorCode;
    @ApiModelProperty(notes = "Timestamp", example = "2019-02-20 09:43:19.77", required = true, position = 2)
    private String timestamp;

    public Response(Exception e) {
        this.message = e.getMessage();
    }

    public Response(){

    }
    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }
}
