package shopApp.services.implSrvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import shopApp.entity.order.Order;
import shopApp.repository.OrderRepository;
import shopApp.services.interfaceSrvc.OrderService;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;

@Service
@Transactional
public class OrderServiceImpl implements OrderService {
    private OrderRepository orderRepository;
    @Autowired
    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public @NotNull List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    @Override
    public Order create(@NotNull(message = "The order can`t be null.") @Valid Order order) {
        order.setDateCreated(LocalDate.now());
        return this.orderRepository.save(order);
    }

    @Override
    public void update(@NotNull(message = "The order can`t be null.") @Valid Order order) {
        this.orderRepository.save(order);
    }
}
