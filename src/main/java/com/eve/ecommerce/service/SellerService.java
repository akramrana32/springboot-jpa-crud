package com.eve.ecommerce.service;

import org.springframework.stereotype.Component;

import com.eve.ecommerce.model.Seller;

@Component
public interface SellerService {
	public Seller saveSeller(Seller seller);

}
