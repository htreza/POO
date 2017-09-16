package br.com.bandtec.app;

//Powered by Henrique Treza
import br.com.bandtec.modelo.Humanos;
import br.com.bandtec.modelo.HumanosUtils;

public class AppHumanos {

    public static void main(String[] args) {
        Humanos h1 = new Humanos(20);
        Humanos h2 = new Humanos(60);
        Humanos h3 = new Humanos(100);
        
        System.out.println("h1 vai morrer daqui a "+h1.getAnosMaximoVida());
        
        System.out.println("h2 vai morrer daqui a "+h2.getAnosMaximoVida());
        
        System.out.println("h3 vai morrer daqui a "+h3.getAnosMaximoVida());
        
        System.out.println("Humanos vivem no máximo "+Humanos.IDADE_MAXIMA_RACA_HUMANA);
        
        System.out.println("Frase de morte do h1: "+HumanosUtils.getFraseMorte(h1));
        
        Humanos caraLoko = HumanosUtils.getHumanoAleatorio();
        System.out.println("Tempo de vida do loko: "+caraLoko.getAnosMaximoVida());
    }

}
