package com.tutorial.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tutorial.api.model.Products;

@Repository
public interface ProductRepository extends CrudRepository<Products, Integer> {

}
