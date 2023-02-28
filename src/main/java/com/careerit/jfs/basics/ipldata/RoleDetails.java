package com.careerit.jfs.basics.ipldata;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class RoleDetails {
    @JsonProperty("name")
    private String roleName;
    @JsonProperty("players")
    private List<Player> playerList;
}
