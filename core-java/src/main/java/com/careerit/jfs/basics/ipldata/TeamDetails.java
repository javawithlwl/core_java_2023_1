package com.careerit.jfs.basics.ipldata;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class TeamDetails{
    @JsonProperty("name")
    private String teamName;
    @JsonProperty("roles")
    private List<RoleDetails> roleDetailsList;
}
