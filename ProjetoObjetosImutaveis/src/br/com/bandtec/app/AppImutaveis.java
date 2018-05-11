
package br.com.bandtec.app;

import java.util.Scanner;


public class AppImutaveis {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        //colocando variaveis como Final(imutaveis), depois que recebem o primeiro valor
        System.out.println("Qual o seu bairro?");
        final String bairro = leitor.next();
        
        System.out.println("Qual a sua idade?");
        final Integer idade = leitor.nextInt();
        
        
    }
    
}
