package com.example.notification1;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
    // Метод для пошуку сповіщень за ID користувача
    List<Notification> findByUserId(Long userId);

    // Метод для пошуку сповіщень за ID курсу
    List<Notification> findByCourseId(Long courseId);
}
