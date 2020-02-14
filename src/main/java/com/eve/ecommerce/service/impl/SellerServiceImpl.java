package com.eve.ecommerce.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eve.ecommerce.model.Seller;
import com.eve.ecommerce.service.SellerService;
import com.eve.ecommerce.service.repository.SellerServiceRepository;

@Service
public class SellerServiceImpl implements SellerService {

	@Autowired
	SellerServiceRepository sellerServiceRepository;

	@Override
	public Seller saveSeller(Seller seller) {
		// TODO Auto-generated method stub
		return sellerServiceRepository.save(seller);
	}

}
