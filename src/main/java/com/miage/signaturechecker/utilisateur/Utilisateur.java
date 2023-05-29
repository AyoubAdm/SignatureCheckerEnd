package com.miage.signaturechecker.utilisateur;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "utilisateur")
public class Utilisateur {

    @Id
    private int idUser;
    private String nomUser;
    private String pswUser;
    private boolean roleUser;

    public Utilisateur() {
    }

    public Utilisateur(int idUser, String nomUser, String pswUser, boolean roleUser) {
        this.idUser = idUser;
        this.nomUser = nomUser;
        this.pswUser = pswUser;
        this.roleUser = roleUser;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getNomUser() {
        return nomUser;
    }

    public void setNomUser(String nomUser) {
        this.nomUser = nomUser;
    }

    public String getPswUser() {
        return pswUser;
    }

    public void setPswUser(String pswUser) {
        this.pswUser = pswUser;
    }

    public boolean getRoleUser() {
        return roleUser;
    }

    public void setRoleUser(boolean roleUser) {
        this.roleUser = roleUser;
    }
}
