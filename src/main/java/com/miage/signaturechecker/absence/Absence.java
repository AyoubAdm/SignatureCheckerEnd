package com.miage.signaturechecker.absence;

import com.miage.signaturechecker.etudiant.Etudiant;

import com.miage.signaturechecker.matiere.Matiere;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.time.LocalDate;

@Entity
public class Absence {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "id_etu")
    private Etudiant etudiant;

    @ManyToOne
    @JoinColumn(name = "id_mat")
    private Matiere matiere;

    private LocalDate date_abs;

    // Constructeurs, getters et setters

    public Absence(int id, Etudiant etudiant, Matiere matiere, LocalDate date_abs) {
        this.id = id;
        this.etudiant = etudiant;
        this.matiere = matiere;
        this.date_abs = date_abs;
    }

    public Absence() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Etudiant getEtudiant() {
        return etudiant;
    }

    public void setEtudiant(Etudiant etudiant) {
        this.etudiant = etudiant;
    }

    public Matiere getMatiere() {
        return matiere;
    }

    public void setMatiere(Matiere matiere) {
        this.matiere = matiere;
    }

    public LocalDate getDate_abs() {
        return date_abs;
    }

    public void setDate_abs(LocalDate date_abs) {
        this.date_abs = date_abs;
    }


}

