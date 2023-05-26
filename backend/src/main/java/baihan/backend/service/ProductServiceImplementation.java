package baihan.backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import baihan.backend.model.Product;
import baihan.backend.repository.ProductRepository;

@Service

public class ProductServiceImplementation implements ProductService {
	
	@Autowired
	ProductRepository repository;

	@Override
	public List<Product> getProducts() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Product saveProduct(Product product) {
		// TODO Auto-generated method stub
		return repository.save(product);
	}
	
	@Override
	public Product getSingleProduct (Long id) {
		Optional<Product> product = repository.findById(id);
		if (product.isPresent()) {
			return product.get();
		}
		throw new RuntimeException("Product is not found for the id " + id);
	}
	
	@Override
	public List<Product> getProductByName (String name) {
		return repository.findByString(name);
		
	}
}
