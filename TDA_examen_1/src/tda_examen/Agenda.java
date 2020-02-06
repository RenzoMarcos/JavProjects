/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tda_examen;
import java.util.HashSet;
import java.util.Iterator;
public class Agenda {

    //una agenda tiene muchos contactos
    boolean aux = false;
    HashSet <Contactos> contactos = new HashSet <Contactos>();

   
    public Contactos buscarContacto(String nombre) {
            
        Contactos c=null;
        Iterator <Contactos> iterator = contactos.iterator();
        while(iterator.hasNext())
            {
                
               c=iterator.next();
               if(c.getNombre().equals(nombre)){
                   aux = true;
               return c;
            }
        }
        if (aux == false){
            System.out.println("El contacto no existe");
        }
        c=null;
        return c;
    }

    
    }
    

    
