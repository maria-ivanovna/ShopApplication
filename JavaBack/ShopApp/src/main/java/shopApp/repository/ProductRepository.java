package shopApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import shopApp.entity.order.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
