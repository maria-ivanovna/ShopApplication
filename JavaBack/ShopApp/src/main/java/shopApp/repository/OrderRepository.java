package shopApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import shopApp.entity.order.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
