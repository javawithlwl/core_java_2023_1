package com.careerit.jfs.basics.generics;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter

public class Product {
  private String name;
  private String price;

  @Override
  public String toString() {
    return super.toString();
  }
}
