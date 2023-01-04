package com.jsp.controller;

import com.jsp.dto.Product;
import com.jsp.service.ProductService;

public class TestSaveProduct {
	public static void main(String[] args) {
		ProductService productservice = new ProductService ();
		
		Product product = new Product();
		 product.setName("jeans");
		 product.setBrand("LeeCooper");
		 product.setType("jeans");
		 product.setPrice(1500);
		 
		 Product product1= productservice.saveProduct(product);
		 if( product1 !=null) {
			 System.out.println("Product Inserted");
			
		} else {
			System.out.println("Not Inserted");
        
		}
	}

}
