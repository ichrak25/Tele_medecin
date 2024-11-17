package com.example.telemed.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@Entity
public class Ordonnance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idOrdonnance;

    @Column(nullable = false)
    private LocalDate datePrescription;

    @ElementCollection
    private List<String> medicaments = new ArrayList<>();

    @Column(nullable = true)
    private String instructions;

    public Ordonnance(){}
}
