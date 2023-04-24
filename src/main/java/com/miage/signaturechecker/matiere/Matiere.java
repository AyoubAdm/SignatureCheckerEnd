package com.miage.signaturechecker.matiere;

import com.miage.signaturechecker.enseignant.Enseignant;
import jakarta.persistence.*;

@Entity
@Table(name = "matiere")
public class Matiere {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMat;


    private String nomMat;



    // Constructeurs, getters et setters


    public Matiere(int id, String nom, Enseignant enseignant) {
        this.idMat = id;
        this.nomMat = nom;

    }

    public Matiere() {
    }

    public int getIdMat() {
        return idMat;
    }

    public void setIdMat(int idMat) {
        this.idMat = idMat;
    }

    public String getNomMat() {
        return nomMat;
    }

    public void setNomMat(String nomMat) {
        this.nomMat = nomMat;
    }

}
