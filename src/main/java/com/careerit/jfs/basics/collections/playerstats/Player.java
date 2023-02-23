package com.careerit.jfs.basics.collections.playerstats;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Player {
  private String name;
  private String role;
  private double amount;
  private String country;
  private String team;
}
