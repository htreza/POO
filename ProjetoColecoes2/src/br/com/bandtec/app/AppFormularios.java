package br.com.bandtec.app;

//Powered by Henrique Treza
import java.util.HashMap;
import java.util.Map;

public class AppFormularios {

    public static void main(String[] args) {
        //Sempre importa Java.UTIL
        //Criando um mapa
        //MAp<Tipo da chave, Tipo do valor>
        Map<String, Double> formulario1 = new HashMap<>();
        //este mapa aceita String como chave e Double como valor
        //inserindo elementos em um mapa
        formulario1.put("peso", 70.0);
        formulario1.put("altura", 1.72);
        formulario1.put("salario", 1000.0);//Colocar d ou D ao lado do núemro o transforma em Double.

        System.out.println("formulario1: " + formulario1);

        //recuperando elementos de um mapa
        double alturaX = formulario1.get("altura");
        double pesoY = formulario1.get("peso");

        //e se pedir uma chave que não existe?
       // double investimentos = formulario1.get("investimentos");
        //System.out.println("investimentos? " + investimentos);

        System.out.println("peso: "+pesoY);
        
        //e se fizer um "put" com uma chave que já existe?
        formulario1.put("peso", 80.0);
        pesoY = formulario1.get("peso");
        System.out.println("peso: "+pesoY);
        
        //recuperando a quantidade de elementos no em um mapa
        System.out.println("Quantos? "+formulario1.size());
        
        //Excluindo elemento de um mapa
        formulario1.remove("peso");
        System.out.println("formulario1: "+formulario1);
    }

}
