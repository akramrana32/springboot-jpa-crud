package com.eve.ecommerce.service.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.eve.ecommerce.model.Products;

@Repository
public interface ProductServiceRepository extends JpaRepository<Products, Long> {
	
	
	    List<Products> findAllByColor(String color);
	    List<Products> findAllByPrice(double price);
	    List<Products> findAllBySize(String size);
	    List<Products> findAllBySku(String sku);
	    List<Products> findAllByBrand_name(String name);
	    @Query(value="SELECT count(Seller .name) FROM PRODUCTS inner join Seller on Seller_id = Seller .id  where seller.name = :name group by Seller.name", nativeQuery = true)
	    int findProductCountBySeller(@Param("name") String name);

}
