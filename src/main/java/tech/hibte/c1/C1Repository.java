package tech.hibte.c1;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.hibte.c1.model.entity.ArentC1;

@Repository
public interface C1Repository extends JpaRepository<ArentC1, String> {
}
