package com.miage.signaturechecker.etudiant;

import jakarta.persistence.*;

@Entity
@Table(name = "etudiant")
public class Etudiant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_etu")
    private int id;
    private String nom_etu;
    private String promo_etu;

    // Constructeurs, getters et setters

    public Etudiant(int id, String promo_etu, String nom_etu) {
        this.id = id;
        this.nom_etu = nom_etu;
        this.promo_etu = promo_etu;
    }

    public Etudiant() {
    }

    public String getNom_etu() {
        return nom_etu;
    }

    public void setNom_etu(String nom_etu) {
        this.nom_etu = nom_etu;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPromo_etu() {
        return promo_etu;
    }

    public void setPromo_etu(String promo_etu) {
        this.promo_etu = promo_etu;
    }
}
