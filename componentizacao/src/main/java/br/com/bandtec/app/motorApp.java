package br.com.bandtec.app;

import br.com.bandtec.componentizacao.Motor;

public class motorApp {
    
    public static void main(String[] args) {
        
        Motor motor = new Motor();
        motor.produzirFaiscaIgnição();
        motor.bombearCombustivel(2.5);
        motor.girarCorreia(2000);
        System.out.println("Energia gerada: " + motor.converterEnergia(300));
        
    }
    
}
