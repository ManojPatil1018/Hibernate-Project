package com.jsp.controller;

import com.jsp.dto.Product;
import com.jsp.service.ProductService;

public class UpdateProduct {
public static void main(String[] args) {
	ProductService productservice = new ProductService ();
	
	Product product = new Product();
	if (product!=null ) {
		 product.setId(3);
		 product.setName("realme 9");
		 product.setBrand("realme");
		 product.setType("SmartPhone");
		 product.setPrice(13200);
		 Product product1= productservice.updateProduct(product);
	} else {
       System.out.println("Product Not Updated");
	}
}
}
