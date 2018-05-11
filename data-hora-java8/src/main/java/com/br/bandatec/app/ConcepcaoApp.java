package com.br.bandatec.app;

//Powered by Henrique Treza
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class ConcepcaoApp {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
     
        LocalDate hoje = LocalDate.now();
        
        System.out.println(hoje.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("Qual a data do seu nascimento? ");
        String nasc = leitor.next();
        
       
       

      
    }

}
