package shopApp.services.interfaceSrvc;

import shopApp.entity.order.Product;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.List;

public interface ProductService {

    @NotNull List<Product> getAllProducts();
    Product getProduct(@Min(value = 1L, message = "Invalid product ID.") long id);
    void save(Product product);
    void delete(@NotNull(message = "Specify product ID") long id );
    //    Product save(Product product);
}
