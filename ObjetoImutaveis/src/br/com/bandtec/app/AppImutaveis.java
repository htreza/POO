package br.com.bandtec.app;
 
//Powered by Henrique Treza

import java.util.Scanner;

public class AppImutaveis {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        /*
        Sempre colocar CPF como String, pois se tiver 00 a esquerda.
        */
        
        //Se vocÊ quiser colocar IMUTAVEL aqui é simples.
        //Só colocar o final na frente do atributo
        //System.out.println("Qual seu bairro? ");
        //final String bairro = leitor.nextLine();
        
        
        System.out.println("Qual seu bairro? ");
        String bairro = leitor.nextLine();
        
        System.out.println("Qual sua idade? ");
        Integer idade = leitor.nextInt();
        
        bairro = "São Judas";
        idade = 80;
    }
}
