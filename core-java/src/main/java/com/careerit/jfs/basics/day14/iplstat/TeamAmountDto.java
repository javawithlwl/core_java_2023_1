package com.careerit.jfs.basics.day14.iplstat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class TeamAmountDto {

    private String team;
    private String teamName;
    private String captain;
    private double totalAmount;
}
