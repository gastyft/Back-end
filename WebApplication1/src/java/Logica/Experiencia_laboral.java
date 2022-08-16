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
public class Experiencia_laboral implements Serializable {
    @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
    
    private int id_exp;
    @Basic
    private String experiencia_laboral;

    public Experiencia_laboral() {
    }

    public Experiencia_laboral(int id_exp, String experiencia_laboral) {
        this.id_exp = id_exp;
        this.experiencia_laboral = experiencia_laboral;
    }

    public Experiencia_laboral(String experiencia) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getId_exp() {
        return id_exp;
    }

    public void setId_exp(int id_exp) {
        this.id_exp = id_exp;
    }

    public String getExperiencia_laboral() {
        return experiencia_laboral;
    }

    public void setExperiencia_laboral(String experiencia_laboral) {
        this.experiencia_laboral = experiencia_laboral;
    }
    
}
