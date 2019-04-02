package com.jwt.demo.entities;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Class representing an answer to authentication request.")
public class AuthResponse {

    @ApiModelProperty(notes = "Unique session token. Used to authenticate user request.", example = "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhc2Rhc2Rhd2Rhc2RzZGEiLCJoYXNo.3jvFz6Th5nqMgsgPQ9R_uJoURpePpmM3YtId", required = true, position = 0)
    private String sessionToken;
    @ApiModelProperty(notes = "Default payment method.", example = "P", required = true, position = 1)
    private String defaultPaymentMethod;
    @ApiModelProperty(notes = "Account number", example = "1234-99230-213", required = true, position = 2)
    private String accNumber;
    @ApiModelProperty(notes = "Merchant name", example = "Banka test", required = true, position = 3)
    private String merchantName;
    @ApiModelProperty(notes = "Merchant place.", example = "Beograd", required = true, position = 4)
    private String merchantPlaceName;
    @ApiModelProperty(notes = "Merchant address.", example = "Omladinskih brigada", required = true, position = 5)
    private String merchantAddress;
    @ApiModelProperty(notes = "Unique terminal id", example = "KCE000234", required = true, position = 6)
    private String tid;

    public String getSessionToken() {
        return sessionToken;
    }

    public void setSessionToken(String sessionToken) {
        this.sessionToken = sessionToken;
    }

    public String getDefaultPaymentMethod() {
        return defaultPaymentMethod;
    }

    public void setDefaultPaymentMethod(String defaultPaymentMethod) {
        this.defaultPaymentMethod = defaultPaymentMethod;
    }

    public String getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(String accNumber) {
        this.accNumber = accNumber;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public String getMerchantPlaceName() {
        return merchantPlaceName;
    }

    public void setMerchantPlaceName(String merchantPlaceName) {
        this.merchantPlaceName = merchantPlaceName;
    }

    public String getMerchantAddress() {
        return merchantAddress;
    }

    public void setMerchantAddress(String merchantAddress) {
        this.merchantAddress = merchantAddress;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }
}