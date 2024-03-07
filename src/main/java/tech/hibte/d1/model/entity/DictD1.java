package tech.hibte.d1.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "d1_dict")
public class DictD1 {

    @Id
    @Column(name = "code")
    private String code;

    @Column(name = "name")
    private String name;

}
