package tech.hibte.d1.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "d1_child_one")
public class ChildOneD1 {

    @Id
    private Long id;

    @Column(name = "additional")
    private String additional;

    @OneToOne
    @MapsId
    @JoinColumn(name = "arent_id")
    private ArentD1 arent;
}
