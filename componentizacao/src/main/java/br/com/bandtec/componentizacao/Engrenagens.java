
package br.com.bandtec.componentizacao;


public class Engrenagens {
    
    public void girar( int rpm){
        
        if (rpm < 0) {
            throw new RuntimeException("não existe rotação negativa");
        }
        System.out.println("Motor girando a "+rpm);
        
    }
    
}
