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

import baihan.backend.model.Product;
import baihan.backend.service.ProductService;

@RestController
@RequestMapping("/products")
@CrossOrigin(origins = "*")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping("")
	public List<Product> getProducts() {
		return productService.getProducts();
	}
	
	@GetMapping("{id}")
	public Product getProduct (@PathVariable Long id) {
		return productService.getSingleProduct(id);
	}
	
	@PostMapping("/save")
	public Product saveProduct(@RequestBody Product product) {
		return productService.saveProduct(product);
	}
	
}
