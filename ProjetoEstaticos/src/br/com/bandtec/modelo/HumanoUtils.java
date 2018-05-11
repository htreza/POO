package br.com.bandtec.modelo;

import java.util.Random;

//Por convenção, classes que terminam com 'Util', 'Utils' ou 'Helper' possuem metodos estaticos
public class HumanoUtils {

    //metodos pulicos e estaticos podem ser utilizados diretamente da clase, 
    //sem necessidade de novo objeto instanciado
    public static String getFraseMorte(Humano humano) {
        if (humano.getAnosMaximosVida() > 10) {
            return "Pé na cova";
        } else {
            return "Vida longa e próspera";
        }
    }

    public static Humano getHumanoAleatorio(){
        int idade =
                new Random().nextInt(Humano.IDADE_MAXIMA_HUMANOS);
                return new Humano(idade);
    }


}
    

