package com.example.notification1;

import org.springframework.stereotype.Service;

import java.util.List;

@Service  // Означає, що це сервісний компонент
public class NotificationService {
    private final NotificationRepository notificationRepository;  // Залежність до репозиторію

    // Конструктор для ін'єкції репозиторію через конструктор
    public NotificationService(NotificationRepository notificationRepository) {
        this.notificationRepository = notificationRepository;
    }

    // Метод для відправки сповіщення
    public Notification sendNotification(Notification notification) {
        return notificationRepository.save(notification);  // Зберігаємо сповіщення в базу даних
    }

    // Метод для отримання списку сповіщень за ID користувача
    public List<Notification> getNotificationsByUserId(Long userId) {
        return notificationRepository.findByUserId(userId);  // Викликаємо репозиторій для отримання сповіщень користувача
    }

    // Метод для отримання списку сповіщень за ID курсу
    public List<Notification> getNotificationsByCourseId(Long courseId) {
        return notificationRepository.findByCourseId(courseId);  // Викликаємо репозиторій для отримання сповіщень курсу
    }

    // Метод для видалення сповіщення за ID
    public void deleteNotification(Long id) {
        notificationRepository.deleteById(id);  // Викликаємо репозиторій для видалення сповіщення
    }
}
