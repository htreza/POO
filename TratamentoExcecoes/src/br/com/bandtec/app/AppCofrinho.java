
package br.com.bandtec.app;

import br.com.bandtec.modelo.Cofrinho;
import java.util.logging.Level;
import java.util.logging.Logger;


public class AppCofrinho {
    
    public static void main(String[] args) {
        
        Cofrinho cofreLoko = null;
        try {
            cofreLoko = new Cofrinho (100);
        } catch (Exception ex) {
            System.out.println("Erro ao criar o cofre "+ex.getMessage());;
        }
        
        //caso o cofrinho não tenha sido criado
        if(cofreLoko == null){
            System.exit(0);
        }
        
        try {
            cofreLoko.depositar(-5);
        } catch (Exception ex) {
            System.out.println("Erro ao depositar. "+ex.getMessage());
        }
        
        try {
            cofreLoko.depositar(-10);
            cofreLoko.depositar(4);
            cofreLoko.quebrar();
            cofreLoko.depositar(10);
            // o programa só entra nesse bloco se a Exception do "depositar()" for lançada
        } catch (Exception ex) {
            System.out.println("Erro ao depositar. "+ex.getMessage());
            
            //linha criada pelo Netbeans que pode ser apagada
            //Logger.getLogger(AppCofrinho.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    
}
