package com.ynding.hardwareprotocol.Dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class RegisterData {

    @JsonProperty(value = "Session")
    private String Session;

    @JsonProperty(value = "ServerVersion")
    private String ServerVersion;
}
