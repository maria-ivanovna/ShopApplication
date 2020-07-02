package shopApp.services.implSrvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import shopApp.entity.order.Product;
import shopApp.exception.ResourceNotFoundException;
import shopApp.repository.ProductRepository;
import shopApp.services.interfaceSrvc.ProductService;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.List;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;
    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public @NotNull List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProduct(@Min(value = 1L, message = "Invalid product ID.") long id) {
        return productRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Product not found"));
    }

    @Override
    public void save(Product product) {
        productRepository.save(product);
    }

    @Override
    public void delete(@NotNull(message = "Specify product ID") long id) {
        productRepository.deleteById(id)
        ;
    }
}
