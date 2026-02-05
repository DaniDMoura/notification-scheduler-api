package tech.danilo.scheduler.dto;

import tech.danilo.scheduler.entity.Channel;
import tech.danilo.scheduler.entity.Notification;
import tech.danilo.scheduler.entity.Status;

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
