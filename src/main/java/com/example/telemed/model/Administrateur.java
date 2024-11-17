package com.example.telemed.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@Entity
public class Administrateur extends User{

    @Column(nullable=false)
    private int niveauAcces;

    @OneToMany
    @JoinColumn(name = "administrateur_id")
    private List<AuditLog> LogsSysteme;

    public Administrateur() {
        super();
    }
}
