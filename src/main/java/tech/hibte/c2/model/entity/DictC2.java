package tech.hibte.c2.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "c2_dict")
public class DictC2 {

    @Id
    @Column(name = "code")
    private String code;

    @Column(name = "name")
    private String name;

}
