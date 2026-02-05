package tech.danilo.scheduler.service;

import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import tech.danilo.scheduler.dto.SchedulerNotificationDto;
import tech.danilo.scheduler.entity.Notification;
import tech.danilo.scheduler.entity.Status;
import tech.danilo.scheduler.repository.NotificationRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

@Service
public class NotificationService {

    private final NotificationRepository notificationRepository;

    public NotificationService(NotificationRepository notificationRepository) {
        this.notificationRepository = notificationRepository;
    }

    @Transactional
    public void schedulerNotification(SchedulerNotificationDto schedulerNotificationDto) {
        notificationRepository.save(schedulerNotificationDto.toNotification());
    }

    public Optional<Notification> findById(Long notificationId) {
        return notificationRepository.findById(notificationId);
    }

    @Transactional
    public void cancelNotification(Long notificationId) {
        var notification = findById(notificationId);

        if (notification.isPresent()) {
            notification.get().setStatus(Status.Values.CANCELED.toStatus());
            notificationRepository.save(notification.get());
        }
    }

    @Transactional
    public void checkAndSendNotification(LocalDateTime localDateTime) {
        List<Notification> notifications = notificationRepository.findByStatusInAndDateTimeBefore(
                List.of(Status.Values.PENDING.toStatus(), Status.Values.ERROR.toStatus()),
                localDateTime);

        notifications.forEach(sendNotification());
    }

    private Consumer<Notification> sendNotification() {
        return notification -> {
            notification.setStatus(Status.Values.SUCCESS.toStatus());
            notificationRepository.save(notification);
        };
    }
}
