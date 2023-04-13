package com.miage.signaturechecker.enseignant;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Enseignant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_ens;
    private String nom_ens;

    // Constructeurs, getters et setters

    public Enseignant(int id_ens, String nom_ens) {
        this.id_ens = id_ens;
        this.nom_ens = nom_ens;
    }

    public Enseignant() {
    }

    public int getId_ens() {
        return id_ens;
    }

    public void setId_ens(int id_ens) {
        this.id_ens = id_ens;
    }

    public String getNom_ens() {
        return nom_ens;
    }

    public void setNom_ens(String nom_ens) {
        this.nom_ens = nom_ens;
    }
}
