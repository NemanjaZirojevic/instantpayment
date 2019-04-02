package com.jwt.demo.entities.token;

public class Token {

    private String value;
    private String status;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Token{" +
                "value='" + value + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
