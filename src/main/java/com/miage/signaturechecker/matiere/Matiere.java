package com.miage.signaturechecker.matiere;

import com.miage.signaturechecker.enseignant.Enseignant;
import jakarta.persistence.*;

@Entity
@Table(name = "matiere")
public class Matiere {

    @Id
    private String nomMat;



    // Constructeurs, getters et setters


    public Matiere(int id, String nom, Enseignant enseignant) {
        this.nomMat = nom;

    }

    public Matiere() {
    }

    public String getNomMat() {
        return nomMat;
    }

    public void setNomMat(String nomMat) {
        this.nomMat = nomMat;
    }

}
