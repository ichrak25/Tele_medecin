package com.example.telemed.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@Entity
public class DossierMedical {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDossier;

    @ElementCollection
    @CollectionTable(name = "historique_notes", joinColumns = @JoinColumn(name = "dossier_id"))
    @Column(name = "note")
    private List<String> historiqueNotes;

    @ElementCollection
    @CollectionTable(name="medicaments", joinColumns = @JoinColumn(name = "dossier_id"))
    @Column(name="medicaments")
    private List<String> medicaments;

    @ElementCollection
    @CollectionTable(name = "examens", joinColumns = @JoinColumn(name = "dossier_id"))
    @Column(name = "examen")
    private List<String> examens;
    @ElementCollection
    @CollectionTable(name = "allergies", joinColumns = @JoinColumn(name = "dossier_id"))
    @Column(name = "allergie")
    private List<String> allergies;

    @ElementCollection
    @CollectionTable(name = "antecedents", joinColumns = @JoinColumn(name = "dossier_id"))
    @Column(name = "antecedent")
    private List<String> antecedents;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "patient_id")
    private Patient patient;


    public DossierMedical() {}

}
