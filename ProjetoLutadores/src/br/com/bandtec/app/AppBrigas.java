package br.com.bandtec.app;

import br.com.bandtec.modelo.Lutador;
import br.com.bandtec.modelo.LutadorForte;
import br.com.bandtec.modelo.LutadorFraco;

public class AppBrigas {

    public static void main(String[] args) {

        Lutador lutadorForte = new LutadorForte(100, 6);
        Lutador lutadorFraco = new LutadorFraco(110, 10);

        System.out.println("O lutador forte tem " + lutadorForte.getVida() + " de vida");
        System.out.println("O lutador fraco tem " + lutadorFraco.getVida() + " de vida");

        lutadorForte.receberGolpe(lutadorFraco.aplicarGolpe());
        lutadorForte.receberGolpe(lutadorFraco.aplicarGolpe());
        lutadorForte.receberGolpe(lutadorFraco.aplicarGolpe());
        lutadorForte.receberGolpe(lutadorFraco.aplicarGolpe());
        
        System.out.println("Agora o lutador forte tem " + lutadorForte.getVida() + " de vida");
        
        lutadorFraco.receberGolpe(lutadorForte.aplicarGolpe());
                
        System.out.println("Agora o lutador fraco tem " + lutadorFraco.getVida() + " de vida");

    }

}
