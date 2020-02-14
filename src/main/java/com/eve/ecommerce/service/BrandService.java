package com.eve.ecommerce.service;

import org.springframework.stereotype.Component;
import com.eve.ecommerce.model.Brand;

@Component
public interface BrandService {
	public Brand saveBrand(Brand brand);

}
