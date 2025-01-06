package com.example.notification1;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/notifications")  // Вказуємо базовий шлях для цього контролера
public class NotificationController {

    private final NotificationService notificationService;  // Залежність до сервісу

    // Конструктор для ін'єкції сервісу через конструктор
    public NotificationController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    // Метод для відправки сповіщення
    @PostMapping
    public ResponseEntity<Notification> sendNotification(@RequestBody Notification notification) {
        return ResponseEntity.ok(notificationService.sendNotification(notification));  // Викликаємо сервіс для створення сповіщення
    }

    // Метод для отримання сповіщень за ID користувача
    @GetMapping("/users/{userId}")
    public ResponseEntity<List<Notification>> getNotificationsByUser(@PathVariable Long userId) {
        return ResponseEntity.ok(notificationService.getNotificationsByUserId(userId));  // Отримуємо список сповіщень для користувача
    }

    // Метод для отримання сповіщень за ID курсу
    @GetMapping("/courses/{courseId}")
    public ResponseEntity<List<Notification>> getNotificationsByCourse(@PathVariable Long courseId) {
        return ResponseEntity.ok(notificationService.getNotificationsByCourseId(courseId));  // Отримуємо список сповіщень для курсу
    }

    // Метод для видалення сповіщення за ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteNotification(@PathVariable Long id) {
        notificationService.deleteNotification(id);  // Викликаємо сервіс для видалення сповіщення
        return ResponseEntity.noContent().build();  // Повертаємо статус без контенту (успішно виконано)
    }
}
