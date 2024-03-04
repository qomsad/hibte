package tech.hibte.c2.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "c2_arent")
public class ArentC2 {

    @Id
    @Column(name = "uuid")
    private String uuid;

    @Column(name = "cpls")
    private String cpls;

    @Column(name = "index")
    private Integer index;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "parent_id")
    private List<ChildC2> child;

}
