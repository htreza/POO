package br.com.bandtec.app;

import java.util.HashMap;
import java.util.Map;

public class AppFormularios {

    public static void main(String[] args) {

        //criando um Mapa
        //<tipo da chave, tipo do valor>
        //esse mapa usa String como chave e Double como valor, mas pode ser qualquer outra coisa
        //inclusive coloca um Map dentro de outro Map, como chave ou valor
        Map<String, Double> formulario1 = new HashMap<>();
        
        //inserindo elementos em um Mapa
        formulario1.put("peso", 70.0);
        formulario1.put("altura", 1.72);
        //colocar o D junto ao numero o "transforma" em double
        formulario1.put("salario", 1000D);
        
        System.out.println("formulario1 "+formulario1);
        
        //recuperando elementos do mapa
        double alturaX = formulario1.get("altura");
        //é case sensitive
        double pesoY = formulario1.get("peso");
        
        // caso tente buscar uma chave que não existe
        //double investimentos = formulario1.get("investimentos");
        //System.out.println("investimentos? "+investimentos);
        //devolve erro de Exception in thread "main" java.lang.NullPointerException
        
        System.out.println("peso "+pesoY);
        
        // ao fazer put com uma chave que já existe 
        formulario1.put("peso",80d);
        pesoY = formulario1.get("peso");
        System.out.println("peso: "+pesoY);
        
        //recuperando a quantidade de elementos de um mapa
        System.out.println("Quantos elementos? "+formulario1.size());
        
        //excluindo elementos de uma mapa
        formulario1.remove("peso");
        System.out.println("formulario1 "+formulario1);
        System.out.println("Quantos elementos agora? "+formulario1.size());
    }

}
