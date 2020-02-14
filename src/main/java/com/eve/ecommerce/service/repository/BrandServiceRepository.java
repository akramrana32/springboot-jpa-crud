package com.eve.ecommerce.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eve.ecommerce.model.Brand;

@Repository
public interface BrandServiceRepository extends JpaRepository<Brand, Long> {
	
}
