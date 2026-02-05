package tech.danilo.scheduler.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.danilo.scheduler.entity.Channel;

public interface ChannelRepository extends JpaRepository<Channel, Long> {
}
