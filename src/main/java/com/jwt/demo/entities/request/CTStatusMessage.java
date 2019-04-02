package com.jwt.demo.entities.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CTStatusMessage {

    @JsonProperty("creditTransferIdentificator")
    private String creditTransferIdentificator;
    @JsonProperty("terminalIdentificator")
    private String terminalIdentificator;
    @JsonProperty("endNodeIndicator")
    private String endNodeIndicator;
    @JsonProperty("creditTransferAmount")
    private String creditTransferAmount;

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

    public String getEndNodeIndicator() {
        return endNodeIndicator;
    }

    public void setEndNodeIndicator(String endNodeIndicator) {
        this.endNodeIndicator = endNodeIndicator;
    }

    public String getCreditTransferAmount() {
        return creditTransferAmount;
    }

    public void setCreditTransferAmount(String creditTransferAmount) {
        this.creditTransferAmount = creditTransferAmount;
    }
}
