package baihan.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import baihan.backend.model.Customer;
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
		return customerRepository.save(customer);
	}

}
