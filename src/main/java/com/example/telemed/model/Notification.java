package com.example.telemed.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@Entity
public class Notification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idNotification; // Unique identifier for the notification

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TypeNotification typeNotification; // Type of the notification (e.g., INFO, ALERT)

    @Column(nullable = false, length = 500)
    private String contenu; // Content/message of the notification

    @Column(nullable = false)
    private LocalDateTime dateEnvoi; // Date and time when the notification was sent

    @Column(nullable = false)
    private boolean estVue; // Status indicating whether the notification has been viewed

    // Default constructor
    public Notification() {
    }
}