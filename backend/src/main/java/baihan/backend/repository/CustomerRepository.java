package baihan.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import baihan.backend.model.Customer;


public interface CustomerRepository extends JpaRepository<Customer, Long>{

	@Query("select c from Customer c where c.correo = ?1 and c.password = ?2")
	Customer loginCustomer(String correo, String password);

}
