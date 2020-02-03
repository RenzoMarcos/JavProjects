
package problema2.simulacro;


public class Operacion {
    
    private int numero=0;
    private int resultado=0;
    
    
    public void Operacion(int numero , int resultado) {
    
        this.numero = numero;
        this.resultado = resultado;
}

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
    
    
    
    public int calcular (int numero){
        int cifra=0;
        int exponente=0;
        
        do{
            cifra =numero%10;
            resultado=resultado+cifra*(int)Math.pow(2,exponente);
            exponente++;
            numero=numero/10;
            
            
        }while(numero>0);
        
       return resultado;
    }
    
    public void mostrar(int resultado){
        
        System.out.println("El resultado es "+ resultado);
    }
}
