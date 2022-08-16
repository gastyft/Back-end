/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;
import Persistencia.ControladoraPersistencia;

import java.util.List;
public class Controladora {
    ControladoraPersistencia controlPersis;

    public Controladora() {
        this.controlPersis = new ControladoraPersistencia();
    }
            
    
      
  /*PERSONA*/
          
            public void crearPersona(Persona per){
               controlPersis.crearPersona(per);
            }
            
            public void eliminarPersona(int id)
            {
       controlPersis.eliminarPersona(id);
            }
            public List<Persona> traerPersonas(){
            return controlPersis.traerPersonas();
            
            }
            /*FALTA EDITAR*/
            
   /*ESTUDIOS*/
            
            
            
            public void crearEstudios(Estudios est){
               controlPersis.crearEstudios(est);
            }
            
            public void eliminarEstudios(int id)
            {
     controlPersis.eliminarEstudios(id);
            }
            
            public List<Estudios> traerEstudios(){
                return controlPersis.traerEstudios();
            }
    
            /*FALTA EDITAR*/
            
            
            /*EXPERIENCIA*/       
            
             
             
             public void crearExperiencia(Experiencia_laboral exp){
                controlPersis.crearExperiencia(exp);
                 
             }
         public void eliminarExperiencia(int id){
               controlPersis.eliminarExperiencia(id);
         }
         public List<Experiencia_laboral> traerExperiencia_laboral(){
             return controlPersis.traerExperiencia_laboral();
         }
         /*FALTA EDITAR*/
         
         
         /*LOGIN*/
         
         public void crearLogin (Login log){
             controlPersis.crearLogin(log);
         }
         public void eliminarLogin(int id){
               controlPersis.eliminarLogin(id);
                         }
         public List<Login> traerLogin()
         {
         return controlPersis.traerLogin();
         }
         
}
