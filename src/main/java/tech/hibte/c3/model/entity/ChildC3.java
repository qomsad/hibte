package tech.hibte.c3.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "c3_child")
public class ChildC3 {

    @Id
    @Column(name = "uuid")
    private String uuid;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "dict_code")
    private DictC3 dict;
}
