package com.example.candidate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Candidat implements Serializable {
    private static final long serialVersionUID = 6711457437559348053L;
    @Id
    @GeneratedValue
    private int id;
    private String nom,prenom,email;
    public int getId() {
        return id;
    }
    public String getNom() {
        return nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public String getEmail() {
        return email;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Candidat() {
        super();
    }
    public Candidat( String nom ){
        super();

        this.nom = nom;

    }

}
