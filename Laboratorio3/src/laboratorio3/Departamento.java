/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio3;

import java.util.HashSet;


public class Departamento {
    
    String nombre;
    
    //Un departamento pertenece solo a una universidad
    
    Universidad universidad;
    
    
    //Un departamento puede tener varios profesores
    HashSet <Profesor> profesores = new HashSet <Profesor>();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
     public void setProfesor (Profesor profesor){
        
        profesores.add(profesor);
        
    }
    
  
}