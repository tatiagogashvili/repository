package ge.softlab.repository.repository.model;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table (name = "safes")
public class Safe {
    @Id
    Integer id;
    String name;
    String address;
    Double product_coast;
    Double sum_product_coast;


}
