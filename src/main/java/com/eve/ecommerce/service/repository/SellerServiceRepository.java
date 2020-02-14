package com.eve.ecommerce.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eve.ecommerce.model.Seller;

@Repository
public interface SellerServiceRepository extends JpaRepository<Seller, Long> {

}
