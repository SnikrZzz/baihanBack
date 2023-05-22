package baihan.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import baihan.backend.model.Customer;
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
	
	@PostMapping("/savecustomer")
	public Customer saveCustomer (@RequestBody Customer customer) {
		return customerService.saveCustomer(customer);
	}
}
