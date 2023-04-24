package com.miage.signaturechecker.enseigner;

import com.miage.signaturechecker.enseignant.Enseignant;
import com.miage.signaturechecker.matiere.Matiere;
import jakarta.persistence.*;

@Entity
@Table(name = "enseigner")
public class Enseigner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEnsr;

    @ManyToOne
    @JoinColumn(name = "idEnsEnsr")
    private Enseignant enseignant;

    @ManyToOne
    @JoinColumn(name = "idMatEnsr")
    private Matiere matiere;

    // Constructeurs, getters et setters

    public Enseigner() {
    }

    public Enseigner(int idEnsr, Enseignant enseignant, Matiere matiere) {
        this.idEnsr = idEnsr;
        this.enseignant = enseignant;
        this.matiere = matiere;
    }

    public int getIdEnsr() {
        return idEnsr;
    }

    public void setIdEnsr(int idEnsr) {
        this.idEnsr = idEnsr;
    }

    public Enseignant getEnseignant() {
        return enseignant;
    }

    public void setEnseignant(Enseignant enseignant) {
        this.enseignant = enseignant;
    }

    public Matiere getMatiere() {
        return matiere;
    }

    public void setMatiere(Matiere matiere) {
        this.matiere = matiere;
    }
}
