package com.careerit.iplstats.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class TeamStatDto {
      private String team;
      private double totalAmount;
      private int count;
      private double minAmount;
      private double maxAmount;
}
