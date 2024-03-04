package tech.hibte.c1.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "c1_child")
public class ChildC1 {

    @Id
    @Column(name = "uuid")
    private String uuid;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "dict_code")
    private DictC1 dict;
}
