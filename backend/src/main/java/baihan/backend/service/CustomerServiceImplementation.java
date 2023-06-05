package baihan.backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import baihan.backend.model.Customer;
import baihan.backend.model.Product;
import baihan.backend.repository.CustomerRepository;

@Service
public class CustomerServiceImplementation implements CustomerService {
	
	@Autowired
	CustomerRepository customerRepository;
	
	@Override
	public List<Customer> getCustomer() {
		// TODO Auto-generated method stub
		return customerRepository.findAll();
	}

	@Override
	public Customer saveCustomer(Customer customer) {
		// TODO Auto-generated method stub
		System.out.println(customer);
		Optional<Customer> cust = customerRepository.findById(customer.getCedula());
		if (cust.isPresent()) {
			throw new RuntimeException("La cédula ya está registrada");
		} else {
			return customerRepository.save(customer);	
		}
		
	}

	@Override
	public Customer loginCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerRepository.loginCustomer(customer.getCorreo(), customer.getPassword());
	}

	@Override
	public Customer getSingleCustomer(Long cedula) {
		Optional<Customer> customer = customerRepository.findById(cedula);
		if (customer.isPresent()) {
			return customer.get();
		}
		throw new RuntimeException("Product is not found for the id " + cedula);
	}

}
