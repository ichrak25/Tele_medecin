package com.example.telemed.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@Entity
public class Feedback {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idFeedback; // Unique identifier for the feedback

    @Column(nullable = false, length = 500)
    private String commentaire; // User's comments, limited to 500 characters

    @Column(nullable = false)
    private int note; // Feedback rating (e.g., 1 to 5)

    @Column(nullable = false)
    private Date dateFeedback; // Date when the feedback was submitted

    // Default constructor
    public Feedback() {
    }
}