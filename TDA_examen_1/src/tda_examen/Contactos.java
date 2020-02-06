
package tda_examen;
import java.util.HashSet;
import java.util.Iterator;

public class Contactos {
    
    String nombre;
    String telefono;
    //Un contacto tiene una sola agenda
    Agenda agenda;
    
    public Contactos (String nombre,String telefono){
        this.nombre = nombre;
        this.telefono= telefono;
        
        
    }
    
    public String getNombre(){
        
        return nombre;
    }
      public String getTelefono(){
        
        return telefono;
    }
    
    public void setNombre(String Nombre){
        
        
        this.nombre=nombre;
    }
  
 
    public void setTelefono(String Telefono){
        this.telefono = telefono;
    }
    
}
