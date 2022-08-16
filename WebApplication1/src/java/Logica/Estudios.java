/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Usuario
 */
@Entity 
public class Estudios implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_estudios;
@Basic
 
    private String primaria;
    private String secundaria;
    private String universidad;
    private String actual;

    public Estudios() {
    }

    public Estudios(int id_estudios, String primaria, String secundaria, String universidad, String actual) {
        this.id_estudios = id_estudios;
        this.primaria = primaria;
        this.secundaria = secundaria;
        this.universidad = universidad;
        this.actual = actual;
    }

    public Estudios(String primaria, String secundaria, String universidad, String actual) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getId_estudios() {
        return id_estudios;
    }

    public void setId_estudios(int id_estudios) {
        this.id_estudios = id_estudios;
    }

    public String getPrimaria() {
        return primaria;
    }

    public void setPrimaria(String primaria) {
        this.primaria = primaria;
    }

    public String getSecundaria() {
        return secundaria;
    }

    public void setSecundaria(String secundaria) {
        this.secundaria = secundaria;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public String getActual() {
        return actual;
    }

    public void setActual(String actual) {
        this.actual = actual;
    }
    
}
    