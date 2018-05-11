package com.br.bandatec.colecoesjava8;
 
//Powered by Henrique Treza

import java.util.Arrays;
import java.util.List;

public class InteracoesPassivasForEach {
    public static void main(String[] args) {
        List<String> frutas = Arrays.asList("uva", "abacaxi", "banana", "caju");
        
        //Interação passiva com "forEach"
        frutas.forEach(fruta -> {
            System.out.println(fruta);
        });
        
        List<Aluno> alunos = Arrays.asList( new Aluno(11, "Ronaldo"),
                new Aluno(22, "Zidane"),
                new Aluno(33, "Beckham"));
        
        System.out.println(alunos);
        alunos.forEach(aluno -> {
            aluno.setMatricula(0);
            aluno.setNome("N/A");
        });
        System.out.println(alunos);
    }
}
