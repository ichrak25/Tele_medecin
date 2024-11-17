package com.example.telemed.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@Entity
public class Medecin extends User {

    @Column(nullable = false)
    private String specialite;

    @OneToMany
    @JoinColumn(name = "medecin_id")
    private List<RendezVous> calendrier;

    @OneToMany
    @JoinColumn(name="medecin_id")
    private List<Patient> patiensSuivis;

    public Medecin(){
        super();
    }



}
