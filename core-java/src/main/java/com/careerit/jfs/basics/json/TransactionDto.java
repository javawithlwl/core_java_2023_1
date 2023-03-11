package com.careerit.jfs.basics.json;

import lombok.*;

import java.time.LocalDate;
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Getter
@Setter
public class TransactionDto {
  private long id;
  private String name;
  private String amount;
  private LocalDate date;
}
