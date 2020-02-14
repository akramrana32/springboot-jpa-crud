package com.eve.ecommerce.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.eve.ecommerce.model.Products;

@Component
public interface ProductsService {

	public Products saveProducts(Products products);

	public List<Products> findProductByColor(String color);
	public List<Products> findAllByPrice(double price);
	public List<Products> findAllBySize(String size);
	public List<Products> findAllBySku(String sku);
	public List<Products> findAllByBrand_name(String name);
	public int findProductCountBySeller(String name);

}
