package com.eve.ecommerce.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eve.ecommerce.model.Brand;
import com.eve.ecommerce.service.BrandService;
import com.eve.ecommerce.service.repository.BrandServiceRepository;

@Service
public class BrandServiceImpl implements BrandService {

	@Autowired
	BrandServiceRepository brandServiceRepository;

	@Override
	public Brand saveBrand(Brand brand) {

		return brandServiceRepository.save(brand);
	}

}
