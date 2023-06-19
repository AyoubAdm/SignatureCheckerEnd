package com.miage.signaturechecker.absence;

import com.miage.signaturechecker.etudiant.Etudiant;

import com.miage.signaturechecker.matiere.Matiere;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "absence")
public class Absence {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAbs;

    @ManyToOne
    @JoinColumn(name = "etuAbs")
    private Etudiant etudiant;

    @ManyToOne
    @JoinColumn(name = "matAbs")
    private Matiere matiere;

    private LocalDate dateAbs;

    private String seance;

    private int duree;

    private boolean estJustifie;

    private String motif;

    // Constructeurs, getters et setters

    public Absence(int id, Etudiant etudiant, Matiere matiere, LocalDate date) {
        this.idAbs = id;
        this.etudiant = etudiant;
        this.matiere = matiere;
        this.dateAbs = date;
    }


    public Absence() {

    }

    public int getIdAbs() {
        return idAbs;
    }

    public void setIdAbs(int idAbs) {
        this.idAbs = idAbs;
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

    public LocalDate getDateAbs() {
        return dateAbs;
    }

    public void setDateAbs(LocalDate dateAbs) {
        this.dateAbs = dateAbs;
    }
}

