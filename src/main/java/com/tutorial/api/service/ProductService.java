package com.tutorial.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tutorial.api.model.Products;
import com.tutorial.api.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	public Iterable<Products>allProducts() {
		
		return productRepository.findAll();
	}
}
