package tech.danilo.magalums.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.danilo.magalums.entity.Channel;

public interface ChannelRepository extends JpaRepository<Channel, Long> {
}
