package baihan.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import baihan.backend.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
