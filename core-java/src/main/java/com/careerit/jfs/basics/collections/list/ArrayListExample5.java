package com.careerit.jfs.basics.collections.list;

import com.careerit.jfs.basics.collections.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListExample5 {

  public static void main(String[] args) {

    List<Product> list = List.of(
        new Product(1001, "Lenovo Thinkpad", 45000),
        new Product(1002, "HP Probook", 145000),
        new Product(1003, "Mac Pro M1", 125000),
        new Product(1004, "Map pro M2", 225000)
    );

    List<String> productNamesList = list.stream()
        .map(ele -> ele.getPname())
        .collect(Collectors.toList());
    System.out.println(productNamesList);

    // Get product name whose price > 1L, and return product names should be in upper case

    list.stream().filter(ele->ele.getPrice()>100000)
        .map(ele->ele.getPname().toUpperCase())
        .collect(Collectors.toList());


    //  Get product name whose price > 1L, and return product names should be in upper case and name should
    // contains "MAC"

    List<String> flist = list.stream().filter(ele -> ele.getPrice() > 100000)
        .map(ele -> ele.getPname().toUpperCase())
        .filter(ele -> ele.contains("MAC"))
        .collect(Collectors.toList());


  }
}
