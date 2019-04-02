package com.jwt.demo.entities.request;




public class RequestToPayMessage {

    private String creditTransferIdentificator;
    private String terminalIdentificator;
    private String creditTransferAmount;
    private String creditTransferAmountCurrency;
    private String debtorAccountNumber;
    private String oneTimeCode;
    private String debtorReference;
    private String debtorName;
    private String debtorAddress;
    private String paymentPurpose;

    public String getDebtorName() {
        return debtorName;
    }

    public void setDebtorName(String debtorName) {
        this.debtorName = debtorName;
    }

    public String getDebtorAddress() {
        return debtorAddress;
    }

    public void setDebtorAddress(String debtorAddress) {
        this.debtorAddress = debtorAddress;
    }

    public String getPaymentPurpose() {
        return paymentPurpose;
    }

    public void setPaymentPurpose(String paymentPurpose) {
        this.paymentPurpose = paymentPurpose;
    }

    public String getCreditTransferAmountCurrency() {
        return creditTransferAmountCurrency;
    }

    public void setCreditTransferAmountCurrency(String creditTransferAmountCurrency) {
        this.creditTransferAmountCurrency = creditTransferAmountCurrency;
    }

    public String getCreditTransferIdentificator() {
        return creditTransferIdentificator;
    }

    public void setCreditTransferIdentificator(String creditTransferIdentificator) {
        this.creditTransferIdentificator = creditTransferIdentificator;
    }

    public String getTerminalIdentificator() {
        return terminalIdentificator;
    }

    public void setTerminalIdentificator(String terminalIdentificator) {
        this.terminalIdentificator = terminalIdentificator;
    }

    public String getCreditTransferAmount() {
        return creditTransferAmount;
    }

    public void setCreditTransferAmount(String creditTransferAmount) {
        this.creditTransferAmount = creditTransferAmount;
    }

    public String getDebtorAccountNumber() {
        return debtorAccountNumber;
    }

    public void setDebtorAccountNumber(String debtorAccountNumber) {
        this.debtorAccountNumber = debtorAccountNumber;
    }

    public String getOneTimeCode() {
        return oneTimeCode;
    }

    public void setOneTimeCode(String oneTimeCode) {
        this.oneTimeCode = oneTimeCode;
    }

    public String getDebtorReference() {
        return debtorReference;
    }

    public void setDebtorReference(String debtorReference) {
        this.debtorReference = debtorReference;
    }
}
