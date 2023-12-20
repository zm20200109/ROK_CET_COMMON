/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Acer
 */
public class Poruka implements Serializable {
    private int id;
    private User posiljalac;
    private User primalac;
    private String tekstPoruke;
    private Date datum;

    public Poruka() {
    }

    public Poruka(int id, User posiljalac, User primalac, String tekstPoruke, Date datum) {
        this.id = id;
        this.posiljalac = posiljalac;
        this.primalac = primalac;
        this.tekstPoruke = tekstPoruke;
        this.datum = datum;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getPosiljalac() {
        return posiljalac;
    }

    public void setPosiljalac(User posiljalac) {
        this.posiljalac = posiljalac;
    }

    public User getPrimalac() {
        return primalac;
    }

    public void setPrimalac(User primalac) {
        this.primalac = primalac;
    }

    public String getTekstPoruke() {
        return tekstPoruke;
    }

    public void setTekstPoruke(String tekstPoruke) {
        this.tekstPoruke = tekstPoruke;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }
    
}
