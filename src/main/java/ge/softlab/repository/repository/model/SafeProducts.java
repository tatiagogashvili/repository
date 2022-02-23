package ge.softlab.repository.repository.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table (name = "safe_products")
public class SafeProducts {
    @Id
    private Integer id;
    @Column(name="safe_id")
    private Integer safeId;
    @Column(name = "product_id")
    private Integer productId;
    @Column(name = "quantity")
    private Integer quantity;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id", referencedColumnName = "id")
    private Product product;
}
