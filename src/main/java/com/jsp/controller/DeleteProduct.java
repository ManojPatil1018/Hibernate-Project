package com.jsp.controller;

import com.jsp.dto.Product;
import com.jsp.service.ProductService;

public class DeleteProduct {

	public static void main(String[] args) {
		ProductService productservice=new ProductService();
		Product product = new Product();
		product.setId(3);
		Product product1=  productservice.deleteProduct(product);
		if (product!=null ) {
			 System.out.println("Product Deleted");
		} else {
            System.out.println("Product not Deleted");
		}
	}
}
