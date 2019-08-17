package com.ynding.hardwareprotocol.Dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Response<T> {

    @JsonProperty(value = "Name")
    private String Name;

    @JsonProperty(value = "TimeStamp")
    private String TimeStamp;

    @JsonProperty(value = "Code")
    private Integer Code;

    @JsonProperty(value = "Message")
    private String Message;

    @JsonProperty(value = "Data")
    private T Data;
}
