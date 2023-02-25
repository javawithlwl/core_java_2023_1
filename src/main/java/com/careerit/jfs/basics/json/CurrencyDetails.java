package com.careerit.jfs.basics.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class CurrencyDetails {

  private String symbol;
  private String name;
  @JsonProperty("symbol_native")
  private String symbolNative;
  @JsonProperty("decimal_digits")
  private int decimalDigits;
  private int rounding;
  private String code;
  @JsonProperty("name_plural")
  private String namePlural;

}
