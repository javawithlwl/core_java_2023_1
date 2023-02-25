package com.careerit.jfs.basics.json;

import lombok.*;

import java.time.LocalDate;
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Getter
@Setter
public class Transaction {
  private long id;
  private String fullName;
  private double amount;
  private LocalDate date;
  private String currency;
}
