package com.br.bandatec.colecoesjava8;

//Powered by henrique Treza
import java.util.Arrays;
import java.util.List;

public class OrdenacaoApp {

    public static void main(String[] args) {
        List<Aluno> alunos = Arrays.asList(
                new Aluno(22, "Ronaldo"),
                new Aluno(33, "Zidane"),
                new Aluno(11, "Beckham"));
        
        alunos.sort((Aluno a1, Aluno a2) -> 
            a1.getMatricula() - a2.getMatricula());
        
        System.out.println(alunos);
        
        //Ordenando pelo nome
        alunos.sort((Aluno a1, Aluno a2) -> 
                a1.getNome().compareTo(a2.getNome()));
        
        System.out.println(alunos);
        
        }

    }


