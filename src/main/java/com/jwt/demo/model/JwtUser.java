package com.jwt.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@JsonIgnoreProperties(ignoreUnknown = true)
@ApiModel(description = "Class representing a user tracked by the application")
public class JwtUser {

    @NotNull
    @NotEmpty
    @NotBlank
    @ApiModelProperty(notes = "Unique identifier of the user. No two users can have the same id.", example = "aae3799a82b9fb8ccd34c1d5aa6565b2", required = true, position = 0)
    private String hashedUserId;

    @NotNull
    @NotEmpty
    @NotBlank
    @ApiModelProperty(notes = "Unique identifier of the terminal. No two terminals can have the same id.", example = "IP000001", required = true, position = 1)
    private String tid;

    public String getHashedUserId() {
        return hashedUserId;
    }

    public void setHashedUserId(String hashedUserId) {
        this.hashedUserId = hashedUserId;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    @Override
    public String toString() {
        return "JwtUser{" +
                "hashedUserId='" + hashedUserId + '\'' +
                ", tid='" + tid + '\'' +
                '}';
    }
}
