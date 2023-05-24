package baihan.backend.service;

import java.util.List;

import baihan.backend.model.Customer;

public interface CustomerService {
	List<Customer> getCustomer();
	Customer saveCustomer(Customer customer);
	Customer loginCustomer(Customer customer);
	Customer getSingleCustomer(Long cedula);
}
