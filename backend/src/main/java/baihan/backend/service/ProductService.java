package baihan.backend.service;

import java.util.List;
import baihan.backend.model.Product;

public interface ProductService {
	List<Product> getProducts();
	Product saveProduct(Product product);
	Product getSingleProduct(Long id);
}
