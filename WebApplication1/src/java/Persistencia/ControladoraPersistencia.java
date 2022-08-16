/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Logica.Estudios;
import Logica.Experiencia_laboral;
import Logica.Login;
import Logica.Persona;
import Persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;




public class ControladoraPersistencia {

    /* HACER PERSONAJPACONTROLLER CON EXPERIENCIA_LABORAL, ESTUDIOS y LOGIN (CRUD)*/
    public ControladoraPersistencia() {
    }

    
  /*PERSONA*/
             PersonaJpaController PersJpa = new PersonaJpaController();
            
            
            public void crearPersona(Persona per){
               PersJpa.create(per);
            }
            
            public void eliminarPersona(int id)
            {
        try {
            PersJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
            }
            public List<Persona> traerPersonas(){
            return PersJpa.findPersonaEntities();
            
            }
            /*FALTA EDITAR*/
            
   /*ESTUDIOS*/
            EstudiosJpaController EstJpa = new EstudiosJpaController();
            
            
            public void crearEstudios(Estudios est){
               EstJpa.create(est);
            }
            
            public void eliminarEstudios(int id)
            {
        try {
            EstJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
            }
            
            public List<Estudios> traerEstudios(){
                return EstJpa.findEstudiosEntities();
            }
    
            /*FALTA EDITAR*/
            
            
            /*EXPERIENCIA*/       
            
             Experiencia_laboralJpaController ExpJpa = new   Experiencia_laboralJpaController();
             
             public void crearExperiencia(Experiencia_laboral exp){
                 ExpJpa.create(exp);
                 
             }
         public void eliminarExperiencia(int id){
                 try {
                     ExpJpa.destroy(id);
                 } catch (NonexistentEntityException ex) {
                     Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
                 }
         }
         public List<Experiencia_laboral> traerExperiencia_laboral(){
             return ExpJpa.findExperiencia_laboralEntities();
         }
         /*FALTA EDITAR*/
         
         
         /*LOGIN*/
         LoginJpaController LogJpa = new LoginJpaController();
         
         public void crearLogin (Login log){
             LogJpa.create(log);
         }
         public void eliminarLogin(int id){
                 try {
                     LogJpa.destroy(id);
                 } catch (NonexistentEntityException ex) {
                     Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
                 }
                         }
         public List<Login> traerLogin()
         {
         return LogJpa.findLoginEntities();
         }
         
            /*FALTA EDITAR*/
}
            

   

