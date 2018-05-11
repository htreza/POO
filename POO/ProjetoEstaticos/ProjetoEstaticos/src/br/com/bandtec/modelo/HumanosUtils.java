package br.com.bandtec.modelo;

//Powered by Henrique Treza
import java.util.Random;
//Normalmente por convenção, classes que terminam com "Util", "Utils" ou "Helper".
//Possuem métodos estáticos.
public class HumanosUtils {

    
    //Métodos públicos e estáticos podem ser invocados diretamente da classe
    //sem instanciá-las
    // EX: Humanos.Utils.getFraseMorte(...)
    public static String getFraseMorte(Humanos humano) {
        if (humano.getAnosMaximoVida() > 10) {
            return "Pé na cova";
        } else {
            return "Vida longa e prospera";
        }
    }

    public static Humanos getHumanoAleatorio() {
        int idade = new Random().nextInt(Humanos.IDADE_MAXIMA_RACA_HUMANA);
        return new Humanos(idade);
    }

}
