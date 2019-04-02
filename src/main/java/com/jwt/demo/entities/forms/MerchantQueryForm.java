package com.jwt.demo.entities.forms;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiModel;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@JsonIgnoreProperties(ignoreUnknown = true)
@ApiModel(description = "Class representing a query form passed to check merchant's account")
public class MerchantQueryForm {

    @NotNull
    @NotEmpty
    @NotBlank
    private String indentificationCode;
    @NotNull
    @NotEmpty
    @NotBlank
    private String version;
    @NotNull
    @NotEmpty
    @NotBlank
    private String merchantAccountNumber;
    private String merchantNameAndPlace;
    @NotNull
    @NotEmpty
    @NotBlank
    private String currencyAndAmount;
    @NotNull
    @NotEmpty
    @NotBlank
    private String paymentCode;
    @NotNull
    @NotEmpty
    @NotBlank
    private String paymentPurpose;
    @NotNull
    @NotEmpty
    @NotBlank
    private String mcc;
    @NotNull
    @NotEmpty
    @NotBlank
    private String referenceNumber;




    public String getIndentificationCode() {
        return indentificationCode;
    }

    public void setIndentificationCode(String indentificationCode) {
        this.indentificationCode = indentificationCode;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getMerchantAccountNumber() {
        return merchantAccountNumber;
    }

    public void setMerchantAccountNumber(String merchantAccountNumber) {
        this.merchantAccountNumber = merchantAccountNumber;
    }

    public String getMerchantNameAndPlace() {
        return merchantNameAndPlace;
    }

    public void setMerchantNameAndPlace(String merchantNameAndPlace) {
        this.merchantNameAndPlace = merchantNameAndPlace;
    }

    public String getCurrencyAndAmount() {
        return currencyAndAmount;
    }

    public void setCurrencyAndAmount(String currencyAndAmount) {
        this.currencyAndAmount = currencyAndAmount;
    }



    public String getPaymentCode() {
        return paymentCode;
    }

    public void setPaymentCode(String paymentCode) {
        this.paymentCode = paymentCode;
    }

    public String getPaymentPurpose() {
        return paymentPurpose;
    }

    public void setPaymentPurpose(String paymentPurpose) {
        this.paymentPurpose = paymentPurpose;
    }

    public String getMcc() {
        return mcc;
    }

    public void setMcc(String mcc) {
        this.mcc = mcc;
    }


    public String getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    @Override
    public String toString() {
        return "MerchantQueryForm{" +
                "indentificationCode='" + indentificationCode + '\'' +
                ", version='" + version + '\'' +
                ", merchantAccountNumber='" + merchantAccountNumber + '\'' +
                ", merchantNameAndPlace='" + merchantNameAndPlace + '\'' +
                ", currencyAndAmount='" + currencyAndAmount + '\'' +
                ", paymentCode='" + paymentCode + '\'' +
                ", paymentPurpose='" + paymentPurpose + '\'' +
                ", mcc='" + mcc + '\'' +
                ", referenceNumber='" + referenceNumber + '\'' +
                '}';
    }
}
