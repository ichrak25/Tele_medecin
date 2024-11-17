package com.example.telemed.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Entity
@AllArgsConstructor
public class Patient extends User {
    @Column(nullable=false, unique = true)
    private String numeroSecuriteSociale;

    @OneToMany
    @JoinColumn(name="patient_id")
    private List<RendezVous> historiqueRendezVous;

    @OneToOne
    @JoinColumn(name = "dossier_medical_id")
    private DossierMedical dossierMedical;

    public Patient(){
        super();
    }
}
