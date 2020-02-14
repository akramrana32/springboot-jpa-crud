package com.eve.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.eve.ecommerce.model.Brand;
import com.eve.ecommerce.service.BrandService;

@RestController
public class BrandController {

	@Autowired
	BrandService brandService;

	@RequestMapping(value = { "/saveBrand" }, method = RequestMethod.POST)
	public Brand saveBrand(@RequestBody Brand brand) {
		return brandService.saveBrand(brand);
	}

}
