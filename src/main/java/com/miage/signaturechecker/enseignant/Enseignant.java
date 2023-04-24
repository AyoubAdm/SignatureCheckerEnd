package com.miage.signaturechecker.enseignant;

import jakarta.persistence.*;

@Entity
@Table(name = "enseignant")
public class Enseignant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEns;
    private String nomEns;

    // Constructeurs, getters et setters

    public Enseignant(int id, String nom) {
        this.idEns = id;
        this.nomEns = nom;
    }

    public Enseignant() {
    }

    public int getIdEns() {
        return idEns;
    }

    public void setIdEns(int idEns) {
        this.idEns = idEns;
    }

    public String getNomEns() {
        return nomEns;
    }

    public void setNomEns(String nomEns) {
        this.nomEns = nomEns;
    }
}
