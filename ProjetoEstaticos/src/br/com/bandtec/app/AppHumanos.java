

package br.com.bandtec.app;

import br.com.bandtec.modelo.Humano;
import br.com.bandtec.modelo.HumanoUtils;



public class AppHumanos {
    
    public static void main(String[] args) {
        
        //obrigatorio passar um parametro pois há um construtor na classe humano
        Humano h1 = new Humano(20);
        Humano h2 = new Humano(60);
        Humano h3 = new Humano(100);
        
        System.out.println("h1 vai morrer daqui a "+h1.getAnosMaximosVida());
        System.out.println("h2 vai morrer daqui a "+h2.getAnosMaximosVida());
        System.out.println("h3 vai morrer daqui a "+h3.getAnosMaximosVida());
        
        // como atributo publico e estatico, pode ser chamado diretamento: IDADE...
        System.out.println("Um humano vive no máximo "+Humano.IDADE_MAXIMA_HUMANOS);
        
        System.out.println("Frase de morte do h1: "
        +HumanoUtils.getFraseMorte(h1));
        
        Humano caraLoko = HumanoUtils.getHumanoAleatorio();
        System.out.println("Tempo de vida do loko: "
        +caraLoko.getAnosMaximosVida());
        
    }
    
}
