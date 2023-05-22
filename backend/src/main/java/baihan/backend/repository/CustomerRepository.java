package baihan.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import baihan.backend.model.Customer;


public interface CustomerRepository extends JpaRepository<Customer, Long>{

	

}
