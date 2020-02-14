package com.eve.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.eve.ecommerce.model.Seller;
import com.eve.ecommerce.service.SellerService;

@RestController
public class SellerController {

	@Autowired
	SellerService sellerService;

	@RequestMapping(value = { "/saveSeller" }, method = RequestMethod.POST)
	public Seller saveSeller(@RequestBody Seller seller) {
		return sellerService.saveSeller(seller);
	}

}
