package com.br.bandatec.colecoesjava8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Powered by Henrique Treza
public class StreamsApp {

    public static void main(String[] args) {

        List<String> frutas = Arrays.asList("uva", "abacaxi", "banana", "caju");

        //filtrando a lista de frutas:
        //colocando todas com a letra "u" em outra lista
        List<String> frutasComU = frutas.stream()
                .filter(fruta -> fruta.contains("u"))
                .collect(Collectors.toList());
        System.out.println(frutasComU);

        List<String> frutas5Letras = frutas.stream()
                .filter(fruta -> fruta.length() >= 5)
                .collect(Collectors.toList());
        System.out.println(frutas5Letras);
        
        long quantasFrutasComU = frutas.stream()
                .filter(fruta -> fruta.contains("u"))
                .count();
        
        System.out.println("Quantas com u? " +quantasFrutasComU);
        
           //Filtrando apenas um atributo dos elementos da lista
           List<Aluno> alunos = Arrays.asList(
                new Aluno(11, "Ronaldo"),
                new Aluno(22, "Zidane"),
                new Aluno(33, "Beckham"));

           List<String> nomes = alunos.stream()
                   .map(Aluno::getNome)
                   .collect(Collectors.toList());
           
           System.out.println(nomes);
    }

}
