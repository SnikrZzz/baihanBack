package baihan.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import baihan.backend.model.Customer;
import baihan.backend.model.Product;
import baihan.backend.service.CustomerService;

@RestController
@RequestMapping("/customers")
@CrossOrigin(origins = "*")
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@GetMapping("")
	public List<Customer> getCustomer() {
		return customerService.getCustomer();
	}
	
	@GetMapping("{cedula}")
	public Customer getCustomer (@PathVariable Long cedula) {
		return customerService.getSingleCustomer(cedula);
	}
	
	@PostMapping("/savecustomer")
	public Customer saveCustomer (@RequestBody Customer customer) {
		return customerService.saveCustomer(customer);
	}
	
	@PostMapping("/login")
	public Customer loginCustomer (@RequestBody Customer customer) {
		System.out.println(customerService.loginCustomer(customer));
		if (customerService.loginCustomer(customer)== null) {
			return new Customer();
		}
		return customerService.loginCustomer(customer);
	}
}
