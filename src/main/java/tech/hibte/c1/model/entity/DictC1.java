package tech.hibte.c1.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "c1_dict")
public class DictC1 {

    @Id
    @Column(name = "code")
    private String code;

    @Column(name = "name")
    private String name;

}
