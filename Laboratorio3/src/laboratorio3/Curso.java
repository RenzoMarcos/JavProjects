/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio3;

import java.util.HashSet;

/**
 *
 * @author LaboratorioFISI
 */
public class Curso {
    
    String nombre;
    String codigo;
    
    //Un curso solo puede ser asignado por un profesor.
    Profesor profesor;
    
    //un curso puede ser llevado por muchos estudiantes.
     HashSet <Alumno> alumnos = new HashSet <Alumno>();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
     
     
    public void setAlumno(Alumno alumno){
        
        alumnos.add(alumno);
        
    }
    
}
