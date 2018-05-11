package br.com.bandtec.app;
 
//Powered by Henrique Treza

import br.com.bandtec.excecoes.DepositoInvalidoException;
import br.com.bandtec.excecoes.ValorInicialInvalidoException;
import br.com.bandtec.modelo.Cofrinho;

public class AppCofrinho {
    
    public static void main(String[] args) {
        
        try {
        Cofrinho cofrinhoDoBem = new Cofrinho(100);
        cofrinhoDoBem.depositar(10);
        cofrinhoDoBem.quebrar();
        cofrinhoDoBem.depositar(10);
        } catch(ValorInicialInvalidoException viex) {
            System.out.println("Erro ao criar o cofre: "+viex.getMessage());
        } catch (DepositoInvalidoException diex){
            System.out.println("Erro ao depositar: "+diex.getMessage());
        }
        
    }
    
}
