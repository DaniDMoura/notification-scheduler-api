package tech.danilo.scheduler.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.danilo.scheduler.entity.Status;

public interface StatusRepository extends JpaRepository<Status, Long> {
}
