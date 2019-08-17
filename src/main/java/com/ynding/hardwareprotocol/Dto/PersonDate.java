package com.ynding.hardwareprotocol.Dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class PersonDate {

    @JsonProperty(value = "Action")
    private String action;

    @JsonProperty(value = "PersonType")
    private int personType;

    @JsonProperty(value = "PersonList")
    private List<PersonInfo> personList;

}
