package com.careerit.sc.di.pms;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Getter
@Setter
@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    public List<Product> getProducts(){
        return productService.getProducts();
    }
}
