package com.miage.signaturechecker.promotion;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "promotion")
public class Promotion {

    @Id
    private String nomPromo;

    public Promotion(String nomPromo) {
        this.nomPromo = nomPromo;
    }

    public Promotion() {
    }

    public String getNomPromo() {
        return nomPromo;
    }

    public void setNomPromo(String nomPromo) {
        this.nomPromo = nomPromo;
    }
}
