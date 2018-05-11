package com.br.bandatec.colecoesjava8;

 //Powered by Henrique Treza
import java.util.HashMap;
import java.util.Map;


public class InteracoesPassivasForEachMapas {
    public static void main(String[] args) {
        Map<String, Double> alturas = new HashMap<>();
        alturas.put("Rambo", 1.75);
        alturas.put("Demolidor", 1.80);
        alturas.put("Messi", 1.50);
        
        alturas.forEach((nome, altura) -> {
            System.out.println("pessoa: "+ nome +" altura: "+ altura);
        });
    }
}
