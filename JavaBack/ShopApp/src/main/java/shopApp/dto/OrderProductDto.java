package shopApp.dto;

import lombok.Data;
import shopApp.entity.order.Product;

@Data
public class OrderProductDto {
    private Product product;
    private Integer quantity;
}
