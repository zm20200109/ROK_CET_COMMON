/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;

/**
 *
 * @author Acer
 */
public class User implements Serializable {
    private int userId;
    private String korisnickoIme;
    private String lozinka;

    public User() {
    }

    public User(int userId, String korisnickoIme, String lozinka) {
        this.userId = userId;
        this.korisnickoIme = korisnickoIme;
        this.lozinka = lozinka;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getKorisnickoIme() {
        return korisnickoIme;
    }

    public void setKorisnickoIme(String korisnickoIme) {
        this.korisnickoIme = korisnickoIme;
    }

    public String getLozinka() {
        return lozinka;
    }

    public void setLozinka(String lozinka) {
        this.lozinka = lozinka;
    }

    @Override
    public String toString() {
        return korisnickoIme ;
    }
    
    
    
}
