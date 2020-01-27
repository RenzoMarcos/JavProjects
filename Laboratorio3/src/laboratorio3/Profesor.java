/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio3;
import java.util.HashSet;


public class Profesor {
    
    String nombre;
    String codigo;
    
    //Un profesor debe estar asignado a un solo departamento
    Departamento departamento;
    
    //Un profesor puede dictar varios cursos
    HashSet <Curso> cursos = new HashSet <Curso>();

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
    
     public void setCurso (Curso curso){
        
      cursos.add(curso);
        
    }
    
    
    
}
