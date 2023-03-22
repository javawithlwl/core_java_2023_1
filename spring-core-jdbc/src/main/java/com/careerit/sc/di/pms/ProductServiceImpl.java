package com.careerit.sc.di.pms;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Getter
@Setter
@Service
public class ProductServiceImpl implements  ProductService{

  @Autowired
  private ProductDao productDao;
  @Override
  public List<Product> getProducts() {
    List<Product> list = productDao.selectProducts();
    //Logic
    for(Product product:list){
        if(product.getPrice()> 100000){
          product.setPrice(product.getPrice() - product.getPrice() * 0.01);
          System.out.println("Product :"+ product.getName()+" has given 10% discount");
        }
    }
    return list;
  }
}
