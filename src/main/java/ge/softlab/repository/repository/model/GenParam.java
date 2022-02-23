package ge.softlab.repository.repository.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "gen_params")
public class GenParam {
    @Id
    private Integer id;
    @Column(name = "param_type")
    private String paramType;
    @Column(name="name")
    private String name;
}
