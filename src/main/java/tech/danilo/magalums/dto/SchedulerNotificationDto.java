package tech.danilo.magalums.dto;

import tech.danilo.magalums.entity.Channel;
import tech.danilo.magalums.entity.Notification;
import tech.danilo.magalums.entity.Status;

import java.time.LocalDateTime;

public record SchedulerNotificationDto(
        LocalDateTime dateTime,
        String destination,
        String message,
        Channel.Values channel
) {
    public Notification toNotification() {
        return new Notification(
                dateTime,
                destination,
                channel.toChannel(),
                message,
                Status.Values.PENDING.toStatus()
        );
    }
}
