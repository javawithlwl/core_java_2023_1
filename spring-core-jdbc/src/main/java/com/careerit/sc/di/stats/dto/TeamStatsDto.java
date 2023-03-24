package com.careerit.sc.di.stats.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TeamStatsDto {
    private String teamName;
    private String team;
    private int count;
    private double totalAmount;
    private double avgAmount;
}
