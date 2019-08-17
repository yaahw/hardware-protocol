package com.ynding.hardwareprotocol.Dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class PersonInfo {

    @JsonProperty(value = "PersonId")
    private String personId;

    @JsonProperty(value = "PersonName")
    private String personName;

    @JsonProperty(value = "Sex")
    private Integer sex;

    @JsonProperty(value = "IDCard")
    private String iDCard;

    @JsonProperty(value = "Nation")
    private String nation;

    @JsonProperty(value = "Birthday")
    private String birthday;

    @JsonProperty(value = "Phone")
    private String phone;

    @JsonProperty(value = "Address")
    private String address;

    @JsonProperty(value = "SaveTime")
    private String saveTime;

    @JsonProperty(value = "LimitTime")
    private Integer limitTime;

    @JsonProperty(value = "StartTime")
    private String startTime;

    @JsonProperty(value = "EndTime")
    private String endTime;

    @JsonProperty(value = "Label")
    private String label;

    @JsonProperty(value = "PersonExtension")
    private PersonExtension personExtension;

    @JsonProperty(value = "PersonPhoto")
    private String personPhoto;

}
