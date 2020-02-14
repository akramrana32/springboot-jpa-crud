package com.eve.ecommerce.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eve.ecommerce.model.Products;
import com.eve.ecommerce.service.ProductsService;
import com.eve.ecommerce.service.repository.ProductServiceRepository;

@Service
public class ProductsServiceImpl implements ProductsService {

	@Autowired
	ProductServiceRepository productServiceRepository;

	@Override
	public Products saveProducts(Products products) {
		// TODO Auto-generated method stub
		return productServiceRepository.save(products);
	}

	@Override
	public List<Products> findProductByColor(String color) {
		// TODO Auto-generated method stub
		return productServiceRepository.findAllByColor(color);
	}

	@Override
	public List<Products> findAllByPrice(double price) {
		// TODO Auto-generated method stub
		return productServiceRepository.findAllByPrice(price);
	}

	@Override
	public List<Products> findAllBySize(String size) {
		// TODO Auto-generated method stub
		return productServiceRepository.findAllBySize(size);
	}

	@Override
	public List<Products> findAllBySku(String sku) {
		// TODO Auto-generated method stub
		return productServiceRepository.findAllBySku(sku);
	}

	@Override
	public List<Products> findAllByBrand_name(String name) {
		// TODO Auto-generated method stub
		return productServiceRepository.findAllByBrand_name(name);
	}

	@Override
	public int findProductCountBySeller(String name) {
		// TODO Auto-generated method stub
		return productServiceRepository.findProductCountBySeller(name);
	}

}
