package tech.hibte.c2.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "c2_child")
public class ChildC2 {

    @Id
    @Column(name = "uuid")
    private String uuid;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "dict_code")
    private DictC2 dict;
}
