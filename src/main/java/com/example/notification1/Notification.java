package com.example.notification1;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.springframework.data.annotation.Id;

@Entity
public class Notification {

    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // ID сповіщення

    private Long userId; // ID користувача
    private Long courseId; // ID курсу (опціонально)
    private String message; // Текст сповіщення

    // Геттер для id
    public Long getId() {
        return id;
    }

    // Сеттер для id
    public void setId(Long id) {
        this.id = id;
    }

    // Геттер для userId
    public Long getUserId() {
        return userId;
    }

    // Сеттер для userId
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    // Геттер для courseId
    public Long getCourseId() {
        return courseId;
    }

    // Сеттер для courseId
    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    // Геттер для message
    public String getMessage() {
        return message;
    }

    // Сеттер для message
    public void setMessage(String message) {
        this.message = message;
    }
}
