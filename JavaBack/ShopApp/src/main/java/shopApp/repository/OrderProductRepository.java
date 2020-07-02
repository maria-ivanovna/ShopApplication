package shopApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import shopApp.entity.order.OrderProduct;
import shopApp.entity.order.OrderProductPK;

public interface OrderProductRepository extends JpaRepository<OrderProduct, OrderProductPK> {
}
