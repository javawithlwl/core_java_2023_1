package com.careerit.jfs.basics.collections.playerstats;

import lombok.*;
import org.apache.commons.lang3.ObjectUtils;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Player {
  private String name;
  private String role;
  private double amount;
  private String country;
  private String team;

}
