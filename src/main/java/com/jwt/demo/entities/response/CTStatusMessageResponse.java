package com.jwt.demo.entities.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class CTStatusMessageResponse {
    private String creditTransferIdentificator;
    private String terminalIdentificator;
    private String approvalCode;
    private String statusCode;

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

    public String getApprovalCode() {
        return approvalCode;
    }

    public void setApprovalCode(String approvalCode) {
        this.approvalCode = approvalCode;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }
}
