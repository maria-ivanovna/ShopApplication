package shopApp.entity.order;

import lombok.*;
import shopApp.entity.BaseIdEntity;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Data
@Table(name = "products")
@NoArgsConstructor
public class Product extends BaseIdEntity {
    @NotNull(message = "Product name is required.")
    @Basic(optional = false)
    private String name;

    private Double price;

    private Double discount;

    private String pictureUrl;

    public Product(Long id, @NotNull(message = "Product name is required.") String name, Double price, Double discountl, String pictureUrl) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.discount = discountl;
        this.pictureUrl = pictureUrl;
    }
}
