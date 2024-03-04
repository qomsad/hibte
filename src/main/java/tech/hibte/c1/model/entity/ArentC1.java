package tech.hibte.c1.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "c1_arent")
public class ArentC1 {

    @Id
    @Column(name = "uuid")
    private String uuid;

    @Column(name = "cpls")
    private String cpls;

    @Column(name = "index")
    private Integer index;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "parent_id")
    private List<ChildC1> child;

}
