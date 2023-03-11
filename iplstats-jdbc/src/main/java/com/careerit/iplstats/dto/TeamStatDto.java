package com.careerit.iplstats.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class TeamStatDto {
      private String team;
      private double totalAmount;
      private int count;
      private double avgAmount;
      private double minAmount;
      private double maxAmount;
}
