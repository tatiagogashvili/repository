package ge.softlab.repository.repository.model;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "products")
public class Product {
   @Id
   private Integer id;
   @Column(name = "type_id")
   private Integer typeId;
   @Column(name = "brand_id")
   private Integer brandId;
   @Column(name = "single_price")
   private Integer singlePrice;
   @Column(name = "quantity")
   private Double quantity;
   @ManyToOne(fetch = FetchType.LAZY)
   @JoinColumn(name = "type_id", referencedColumnName = "id")
   private GenParam type;
}
