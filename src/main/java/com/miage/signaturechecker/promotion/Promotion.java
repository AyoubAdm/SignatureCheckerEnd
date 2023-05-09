package com.miage.signaturechecker.promotion;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name = "promotion", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"nomPromo"})
})
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
