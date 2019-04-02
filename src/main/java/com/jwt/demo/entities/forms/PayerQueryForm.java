package com.jwt.demo.entities.forms;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiModel;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@JsonIgnoreProperties(ignoreUnknown = false)
@ApiModel(description = "Class representing a query form passed to check customer's account")
public class PayerQueryForm {
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
    private String currencyAndAmount;
    @NotNull
    @NotEmpty
    @NotBlank
    private String payerAccountNumber;
    @NotNull
    @NotEmpty
    @NotBlank
    private String payerNameAndPlace;
    @NotNull
    @NotEmpty
    @NotBlank
    private String paymentPurpose;
    @NotNull
    @NotEmpty
    @NotBlank
    private String oneTimePayentCode;

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

    public String getCurrencyAndAmount() {
        return currencyAndAmount;
    }

    public void setCurrencyAndAmount(String currencyAndAmount) {
        this.currencyAndAmount = currencyAndAmount;
    }

    public String getPayerAccountNumber() {
        return payerAccountNumber;
    }

    public void setPayerAccountNumber(String payerAccountNumber) {
        this.payerAccountNumber = payerAccountNumber;
    }

    public String getPayerNameAndPlace() {
        return payerNameAndPlace;
    }

    public void setPayerNameAndPlace(String payerNameAndPlace) {
        this.payerNameAndPlace = payerNameAndPlace;
    }

    public String getPaymentPurpose() {
        return paymentPurpose;
    }

    public void setPaymentPurpose(String paymentPurpose) {
        this.paymentPurpose = paymentPurpose;
    }

    public String getOneTimePayentCode() {
        return oneTimePayentCode;
    }

    public void setOneTimePayentCode(String oneTimePayentCode) {
        this.oneTimePayentCode = oneTimePayentCode;
    }

    @Override
    public String toString() {
        return "PayerQueryForm{" +
                "indentificationCode='" + indentificationCode + '\'' +
                ", version='" + version + '\'' +
                ", currencyAndAmount='" + currencyAndAmount + '\'' +
                ", payerAccountNumber='" + payerAccountNumber + '\'' +
                ", payerNameAndPlace='" + payerNameAndPlace + '\'' +
                ", paymentPurpose='" + paymentPurpose + '\'' +
                ", oneTimePayentCode='" + oneTimePayentCode + '\'' +
                '}';
    }
}