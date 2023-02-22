package com.careerit.jfs.basics.collections.set;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
class Product {
  private String name;
  private double price;

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Product product = (Product) o;
    return Double.compare(product.price, price) == 0 && Objects.equals(name, product.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, price);
  }
}

public class SetExample2 {

  public static void main(String[] args) {

    Product p1 = new Product("Lenovo Thinkpad", 45000);
    Product p2 = new Product("Dell Studio15", 55000);
    Product p3 = new Product("Lenovo Thinkpad", 45000);
    Product p4 = p1;
    Set<Product> products = new HashSet<>();
    products.add(p1);
    products.add(p2);
    products.add(p3);
    products.add(p4);
    System.out.println(products.size());

  }
}
