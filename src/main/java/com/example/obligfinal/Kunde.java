package com.example.obligfinal;

import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

public class Kunde {
private String fornavn;
private String etternavn;
private String telefonnr;
private String epost;
private int antall;
private String film;

public Kunde(String fornavn, String etternavn, String telefonnr, String epost, int antall,String film) {
this.fornavn=fornavn;
this.etternavn=etternavn;
this.epost=epost;
this.telefonnr=telefonnr;
this.film=film;
this.antall=antall;
}
public Kunde() { }
    public String getFornavn() {
    return fornavn;
    }
    public void setFornavn(String fornavn) {
    this.fornavn=fornavn;
    }
    public String getEtternavn() {
    return etternavn;
    }
    public void setEtternavn(String etternavn) {
    this.etternavn=etternavn;
    }
    public String getEpost() {
    return epost;
    }
    public void setEpost(String epost) {
    this.epost=epost;
    }
    public String getTelefonnr() {
    return telefonnr;
    }
    public void setTelefonnr(String telefonnr) {
    this.telefonnr=telefonnr;
    }
    public int getAntall() {
    return antall;
    }
    public void setAntall(int antall) {
    this.antall=antall;
    }
    public String getFilm() {return film; }
    public void setFilm(String film)  { this.film=film;}

}
