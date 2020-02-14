package com.eve.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.eve.ecommerce.model.Products;
import com.eve.ecommerce.service.ProductsService;

@RestController
public class ProductController {

	@Autowired
	ProductsService productsService;

	@RequestMapping(value = { "/saveProduct" }, method = RequestMethod.POST)
	public Products saveBrand(@RequestBody Products products) {
		return productsService.saveProducts(products);
	}

	@RequestMapping(value = { "/findProductByColor" }, method = RequestMethod.POST)
	public List<Products> findProductByColor(@RequestParam String color) {
		return productsService.findProductByColor(color);
	}

	@RequestMapping(value = { "/findAllByPrice" }, method = RequestMethod.POST)
	public List<Products> findAllByPrice(@RequestParam double price) {
		return productsService.findAllByPrice(price);
	}

	@RequestMapping(value = { "/findAllBySize" }, method = RequestMethod.POST)
	public List<Products> findAllBySize(@RequestParam String size) {
		return productsService.findAllBySize(size);
	}

	@RequestMapping(value = { "/findAllBySku" }, method = RequestMethod.POST)
	public List<Products> findAllBySku(@RequestParam String sku) {
		return productsService.findAllBySku(sku);
	}
	
	@RequestMapping(value = { "/findAllByBrand_name" }, method = RequestMethod.POST)
	public List<Products> findAllByBrand_name(@RequestParam String name) {
		return productsService.findAllByBrand_name(name);
	}

	
	@RequestMapping(value = { "/findProductCountBySeller" }, method = RequestMethod.POST)
	public int findProductCountBySeller(@RequestParam String name) {
		return productsService.findProductCountBySeller(name);
	}

}
