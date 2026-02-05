package tech.danilo.magalums.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.danilo.magalums.entity.Status;

public interface StatusRepository extends JpaRepository<Status, Long> {
}
