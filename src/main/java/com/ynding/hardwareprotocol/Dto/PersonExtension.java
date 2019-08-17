package com.ynding.hardwareprotocol.Dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class PersonExtension {

    @JsonProperty(value = "PersonCode1")
    private String personCode1;
    @JsonProperty(value = "PersonCode2")
    private String personCode2;
    @JsonProperty(value = "PersonCode3")
    private String personCode3;
    @JsonProperty(value = "PersonReserveName")
    private String personReserveName;
    @JsonProperty(value = "PersonParam1")
    private String personParam1;
    @JsonProperty(value = "PersonParam2")
    private String personParam2;
    @JsonProperty(value = "PersonParam3")
    private String personParam3;
    @JsonProperty(value = "PersonParam4")
    private String personParam4;
    @JsonProperty(value = "PersonParam5")
    private String personParam5;
    @JsonProperty(value = "PersonData1")
    private String personData1;
    @JsonProperty(value = "PersonData2")
    private String personData2;
    @JsonProperty(value = "PersonData3")
    private String personData3;
    @JsonProperty(value = "PersonData4")
    private String personData4;
    @JsonProperty(value = "PersonData5")
    private String personData5;

}
