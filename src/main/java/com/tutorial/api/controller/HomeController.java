package com.tutorial.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tutorial.api.model.Products;
import com.tutorial.api.service.ProductService;

@RestController
public class HomeController {

	@Autowired
	private ProductService productService;
	
	@RequestMapping(value = {"api/v1/products"}, method = RequestMethod.GET)
	private Iterable<Products> getProducts() {
		
		return productService.allProducts();
	}
}
