package br.com.bandtec.app;

//Powered by Henrique Treza
import br.com.bandtec.modelo.Cofrinho;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AppCofrinho {

    public static void main(String[] args) {
Cofrinho cofreLoko = null;
        try {
            cofreLoko = new Cofrinho(-100);

        } catch (Exception ex) {
            //O programa só entra neste bloco se 
            //A Exception do "Depositar()" for lançada.
            System.out.println("Erro ao criar cofre: " + ex.getMessage());
        }
        //Caso o cofrinho não tenha sido criado.
        if(cofreLoko == null){
            System.exit(0);
        }
        
        try {
           
            cofreLoko.depositar(-5);
            cofreLoko.quebrar();
            cofreLoko.depositar(50);
        } catch (Exception ex) {
            //O programa só entra neste bloco se 
            //A Exception do "Depositar()" for lançada.
            System.out.println("Erro ao depositar: " + ex.getMessage());
        }
    }

}
