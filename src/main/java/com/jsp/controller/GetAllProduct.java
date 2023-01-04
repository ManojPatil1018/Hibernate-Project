package com.jsp.controller;

import com.jsp.dto.Product;
import com.jsp.service.ProductService;

public class GetAllProduct {
public static void main(String[] args) {
	
	ProductService productservice=new ProductService();
	Product product = new Product();
	 productservice.getAllProduct(product);
}
}
