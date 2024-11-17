package com.example.telemed.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Entity
public class ConsultationVideo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idConsultation; // Unique ID for the consultation

    @Column(nullable = false)
    private String lienVideo; // Video link for the consultation

    @Column(nullable = false)
    private boolean estSecurisee; // Indicates if the consultation is secure

    @Column(nullable = false)
    private int dureeMax; // Maximum duration of the video consultation in minutes

    @Enumerated(EnumType.STRING)
    private STATUSCONS statut; // Status of the consultation (e.g., Consultation, Suivi, Urgence)

    // Default constructor
    public ConsultationVideo() {}
}
