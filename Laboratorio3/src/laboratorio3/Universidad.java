/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio3;

import java.util.HashSet;
public class Universidad {
    
    
    String nombre;
    //Una universidad puede tener muchos departamentos;
    
    HashSet <Departamento> departamentos = new HashSet <Departamento>();
    
    //Una universidad tiene muchos alumnos
    
    HashSet <Alumno> alumnos = new HashSet <Alumno>();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    //metodos que agregan objetos en los arreglos hash
    public void setDepartamentos(Departamento departamento){
        
        departamentos.add(departamento);
        
    }
    
    public void setAlumnos(Alumno alumno){
        
        alumnos.add(alumno);
        
    }
}
