package com.example.telemed.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
public class Paiement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPaiement;

    @Column(nullable = false)
    private double montant;

    @Column(nullable = false)
    private Date datePaiement;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private STATUSPAI statut;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private MP modePaiement;

    // Default constructor
    public Paiement() {
    }
}