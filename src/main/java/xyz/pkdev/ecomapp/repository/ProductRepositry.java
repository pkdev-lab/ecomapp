package xyz.pkdev.ecomapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import xyz.pkdev.ecomapp.entity.Product;

@Repository
public interface ProductRepositry extends JpaRepository<Product, Long> {
	
	List<Product> findByNameContainingIgnoreCase(String name);
	@Query("SELECT DISTINCT brand FROM Product")
	List<String> findAllBrandsDistincts();
}
