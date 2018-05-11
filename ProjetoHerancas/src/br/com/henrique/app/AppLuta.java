package br.com.henrique.app;

import br.com.henrique.modelo.Lutador;

public class AppLuta {

    public static void main(String[] args) {

        Lutador lutador1 = new Lutador();
        System.out.println(lutador1.getVida());
        
        lutador1.setForca(100);
        lutador1.socoFraco();
        
        lutador1.receberGolpe(15);
        System.out.println(lutador1.getVida());

    }

}
