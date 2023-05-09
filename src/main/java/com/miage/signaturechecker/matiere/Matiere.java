package com.miage.signaturechecker.matiere;

import com.miage.signaturechecker.enseignant.Enseignant;
import jakarta.persistence.*;

@Entity
@Table(name = "matiere", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"nomMat"})
})
public class Matiere {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMat;
    private String nomMat;



    // Constructeurs, getters et setters


    public Matiere(String nom, Enseignant enseignant) {
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
