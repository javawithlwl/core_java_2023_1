package com.careerit.iplstats.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class RoleStatDto {
      private String team;
      private String role;
      private double totalAmount;
      private int count;
      private double minAmount;
      private double maxAmount;
      private double avgAmount;
}
