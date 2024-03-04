package tech.hibte.c3;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.hibte.c3.model.entity.ArentC3;

@Repository
public interface C3Repository extends JpaRepository<ArentC3, String> {
}
