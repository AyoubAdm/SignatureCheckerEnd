package com.miage.signaturechecker.etudiant;

import jakarta.persistence.*;

@Entity
@Table(name = "etudiant")
public class Etudiant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEtu;
    private String nomEtu;
    private String promo;
    private String td;
    private String tp;

    // Constructeurs, getters et setters

    public Etudiant(int id, String promo, String nom, String td, String tp) {
        this.idEtu = id;
        this.nomEtu = nom;
        this.promo = promo;
        this.td = td;
        this.tp = tp;
    }


    public Etudiant() {
    }

    public int getIdEtu() {
        return idEtu;
    }

    public void setIdEtu(int idEtu) {
        this.idEtu = idEtu;
    }

    public String getNomEtu() {
        return nomEtu;
    }

    public void setNomEtu(String nomEtu) {
        this.nomEtu = nomEtu;
    }

    public String getPromo() {
        return promo;
    }

    public void setPromo(String promo) {
        this.promo = promo;
    }

    public String getTd() {
        return td;
    }

    public void setTd(String td) {
        this.td = td;
    }

    public String getTp() {
        return tp;
    }

    public void setTp(String tp) {
        this.tp = tp;
    }
}
