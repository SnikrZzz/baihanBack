package baihan.backend.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import baihan.backend.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	@Query("select p from Product p where LOWER(p.name) like %?1% or LOWER(p.description) like %?1%")
	List<Product> findByString(String name);
	
	@Query("select p from Product p where p.customer.cedula = ?1")
	List<Product> findByCustomerId(Long cedula);
	
}
