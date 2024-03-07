package tech.hibte.d1;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.hibte.d1.model.entity.ArentD1;

@Repository
public interface D1Repository extends JpaRepository<ArentD1, String> {
}
