package com.jwt.demo.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@JsonIgnoreProperties(ignoreUnknown = true)
@ApiModel(description = "Class representing activation form sent in body of activation request")
public class ActivationForm {

    @NotNull
    @NotEmpty
    @NotBlank
    @ApiModelProperty(notes = "Unique identifier of the user. No two users can have the same id.", example = "aae3799a82b9fb8ccd34c1d5aa6565b2", required = true, position = 0)
    private String hashedUserId;
    @NotNull
    @NotEmpty
    @NotBlank
    @ApiModelProperty(notes = "Unique activation code of application.", example = "123TEST", required = true, position = 1)
    private String activationCode;
    @NotNull
    @NotEmpty
    @NotBlank
    @ApiModelProperty(notes = "Unique secured android ID", example = "00000000-54b3-e7c7-0000-000046bffd97", required = true, position = 2)
    private String secureAndroidId;

    public String getHashedUserId() {
        return hashedUserId;
    }

    public void setHashedUserId(String hashedUserId) {
        this.hashedUserId = hashedUserId;
    }

    public String getActivationCode() {
        return activationCode;
    }

    public void setActivationCode(String activationCode) {
        this.activationCode = activationCode;
    }

    public String getSecureAndroidId() {
        return secureAndroidId;
    }

    public void setSecureAndroidId(String secureAndroidId) {
        this.secureAndroidId = secureAndroidId;
    }
}
