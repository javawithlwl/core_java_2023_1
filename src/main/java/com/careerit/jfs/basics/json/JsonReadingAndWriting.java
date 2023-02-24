package com.careerit.jfs.basics.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
class Product {
  private String pname;
  private double price;
}

public class JsonReadingAndWriting {

  public static void main(String[] args) throws IOException {

    Product product = Product.builder().pname("Lenvo Thinkpad").price(98000).build();
    ObjectMapper objectMapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);;
    String jsonStr = objectMapper.writeValueAsString(product);
    System.out.println(jsonStr);

    Product product1 = objectMapper.readValue(jsonStr, Product.class);
    System.out.println(product1.getPname() + " " + product1.getPrice());

    TypeReference<List<Product>> typeReference = new TypeReference<List<Product>>() {};
    List<Product> products = objectMapper.readValue(JsonReadingAndWriting.class.getResourceAsStream("/products.json"), typeReference);
    for(Product pro:products){
      System.out.println(pro);
      pro.setPrice(pro.getPrice()-pro.getPrice()*0.01);
    }
    objectMapper.writeValue(new File("discount_products.json"),products);

    String jsonData= """
            {
              "name": "Krish",
              "email": "krish.t@wipro.com",
              "mobile": "9898989898"
              }
        """;
    JsonNode jsonNode = objectMapper.readTree(jsonData);
    jsonNode.fieldNames().forEachRemaining(ele->{
      System.out.println(ele+" "+jsonNode.get(ele));
    });
  }
}
