
package problema2.simulacro;
import java.util.Scanner;



public class main {

   
    public static void main(String[] args) {
        int n=0;
        int res=0;
        Scanner sc = new Scanner(System.in);
        
       Operacion cal1 = new Operacion();
       
        System.out.println("INGRESE UN NUMERO BINARIO: ");
        n=sc.nextInt();
        
        cal1.setNumero(n);
       res = cal1.calcular(n);
        cal1.mostrar(res);
    }
    
}
