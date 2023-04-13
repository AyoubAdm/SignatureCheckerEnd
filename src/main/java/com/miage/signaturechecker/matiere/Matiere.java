package com.miage.signaturechecker.matiere;

import com.miage.signaturechecker.enseignant.Enseignant;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Matiere {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_mat;
    private String nom_mat;

    @ManyToOne
    @JoinColumn(name = "id_ens")
    private Enseignant enseignant;


    // Constructeurs, getters et setters


    public Matiere(int id_mat, String nom_mat, Enseignant enseignant) {
        this.id_mat = id_mat;
        this.nom_mat = nom_mat;
        this.enseignant = enseignant;
    }

    public Matiere() {
    }

    public int getId_mat() {
        return id_mat;
    }

    public void setId_mat(int id_mat) {
        this.id_mat = id_mat;
    }

    public String getNom_mat() {
        return nom_mat;
    }

    public void setNom_mat(String nom_mat) {
        this.nom_mat = nom_mat;
    }

    public Enseignant getEnseignant() {
        return enseignant;
    }

    public void setEnseignant(Enseignant enseignant) {
        this.enseignant = enseignant;
    }
}
