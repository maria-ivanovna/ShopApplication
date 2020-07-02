package shopApp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import shopApp.entity.order.Product;
import shopApp.services.interfaceSrvc.ProductService;

@SpringBootApplication

public class SpringBootShopApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootShopApplication.class, args);
    }
    @Bean
    CommandLineRunner runner(ProductService productService) {
        return args -> {
            productService.save(new Product(1L, "TV Set", 300.00, 50.00, "http://placehold.it/200x100"));
            productService.save(new Product(2L, "Game Console", 200.00, 40.00, "http://placehold.it/200x100"));
            productService.save(new Product(3L, "Sofa", 100.00, 10.00, "http://placehold.it/200x100"));
            productService.save(new Product(4L, "Icecream", 5.00, 0.5, "http://placehold.it/200x100"));
            productService.save(new Product(5L, "Beer", 3.00, 1.00, "http://placehold.it/200x100"));
            productService.save(new Product(6L, "Phone", 500.00, 100.00, "http://placehold.it/200x100"));
            productService.save(new Product(7L, "Watch", 30.00, 0.00,"http://placehold.it/200x100"));
        };
    }
}
