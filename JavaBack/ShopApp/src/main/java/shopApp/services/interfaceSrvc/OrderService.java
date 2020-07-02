package shopApp.services.interfaceSrvc;

import shopApp.entity.order.Order;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

public interface OrderService {

    @NotNull List<Order> getAllOrders();
    Order create(@NotNull(message = "The order can`t be null.") @Valid Order order);
    void update(@NotNull(message = "The order can`t be null.") @Valid Order order);
}
