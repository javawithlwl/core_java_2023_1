package com.careerit.sc.di.stats.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PlayerDto {
  private String name;
  private String role;
  private String team;
  private String country;
  private double amount;
  private String teamName;
}
