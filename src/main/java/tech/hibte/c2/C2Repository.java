package tech.hibte.c2;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.hibte.c2.model.entity.ArentC2;

@Repository
public interface C2Repository extends JpaRepository<ArentC2, String> {
}
