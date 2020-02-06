
package tda_examen;

import java.util.Scanner;
import java.util.HashSet;
import java.util.Iterator;

public class TDA_examen {

 
    public static void main(String[] args) {
        String nombre;    
        Scanner entrada = new Scanner(System.in);
        Contactos cont1 = new  Contactos ("Carlos","924251711");
        Contactos cont2 = new Contactos("Mario","72382828");
        Contactos cont3 = new Contactos("Jose" , "925111542");
        Contactos cont4 = new Contactos ("Renzo", "997222123");
        Contactos cont5 = new Contactos ("jhon" , "999777222");
        Contactos cont6 = new Contactos("Jesus", "992888112");
        Contactos cont7 = new Contactos("yep", "97712351");
        Contactos cont8 = new Contactos ("Luchito", "912321124");
        Contactos cont9 = new Contactos ("Arian", "97113352");
        Contactos cont10 = new Contactos("Luchito", "998217324");
        Agenda agenda1 = new Agenda();
        agenda1.contactos.add(cont1);
        agenda1.contactos.add(cont2);
        agenda1.contactos.add(cont3);
        agenda1.contactos.add(cont4);
        agenda1.contactos.add(cont5);
        agenda1.contactos.add(cont6);
        agenda1.contactos.add(cont7);
        agenda1.contactos.add(cont8);
        agenda1.contactos.add(cont9);
        agenda1.contactos.add(cont10);
        
        System.out.println("Ingrese el nombre: ");
        try{
            System.out.println("El numero de telefono es: "+agenda1.buscarContacto(entrada.nextLine()).getTelefono());
        }
        catch(Exception e){
            
        }
        
    }

  
    
    
}
