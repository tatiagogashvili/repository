package ge.softlab.repository.repository.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@SequenceGenerator(sequenceName = "shippings_id_seq", name = "rac gamixardeba",allocationSize = 1)
@Entity
@Data
@Table(name = "shippings")
public class Shipping {
    @Id
    @GeneratedValue(generator = "rac gamixardeba",strategy = GenerationType.AUTO)
    Integer id;
    LocalDateTime date;
    String address;
    Integer count;
    String comment;
}
