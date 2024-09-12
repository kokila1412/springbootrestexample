package com.javatpoint;
import java.util.ArrayList;
import java.util.List;

import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ProductController
{
    //@Autowired
//private IProductService productService;
//mapping the getProduct() method to /product
    @GetMapping(value = "/product")
    public ResponseEntity getProduct()
    {
        return ResponseEntity.ok("Hello");
//finds all the products
//List<Product> products = new ArrayList<>();
//products.add(new Product(1,"","",2,3));
////returns the product list
//return products;
    }
}
