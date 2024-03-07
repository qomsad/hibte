package tech.hibte.d1.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "d1_arent")
public class ArentD1 {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "info")
    private String info;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "parent_id")
    private List<ChildManyD1> childMany;

    @OneToOne(mappedBy = "arent", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private ChildOneD1 childOne;

}
