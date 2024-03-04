package tech.hibte.c3.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "c3_arent")
public class ArentC3 {

    @Id
    @Column(name = "uuid")
    private String uuid;

    @Column(name = "cpls")
    private String cpls;

    @Column(name = "index")
    private Integer index;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "parent_id")
    private List<ChildC3> child;

}
