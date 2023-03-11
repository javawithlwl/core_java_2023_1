package com.careerit.jfs.basics.collections.map;

import lombok.*;
import org.apache.commons.collections.map.HashedMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
class Product{
      private String name;
      private double price;
      private String category;
}
public class ProductData {

  public static void main(String[] args) {
    String data = "Milk,50,Grocery-Curd,50,Grocery-Bansi Rava,60,Grocery-iPhone15,89000,Mobiles-OOPO Reno2Z,39000,Mobiles-Tshirt,500,Fashion-Nshirt,500,Fashion";
    String[] arr = data.split("-");
    List<Product> products = new ArrayList<>();
    for(String pdata:arr){
        String[] arrEle = pdata.split(",");
        Product product = new Product();
        product.setName(arrEle[0]);
        product.setPrice(Double.parseDouble(arrEle[1]));
        product.setCategory(arrEle[2]);
        products.add(product);
    }

    Map<String, List<Product>> categoryMap = new HashMap<>();

    for(Product product:products){
      List<Product> list = categoryMap.getOrDefault(product.getCategory(), new ArrayList<>());
      list.add(product);
      categoryMap.put(product.getCategory(),list);
    }

  }
}
