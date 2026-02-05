package tech.danilo.scheduler.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import tech.danilo.scheduler.entity.Notification;
import tech.danilo.scheduler.entity.Status;

import java.time.LocalDateTime;
import java.util.List;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
    List<Notification> findByStatusInAndDateTimeBefore(List<Status> status, LocalDateTime localDateTime);
}
