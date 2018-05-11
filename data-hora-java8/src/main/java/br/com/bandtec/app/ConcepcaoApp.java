package br.com.bandtec.app;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ConcepcaoApp {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual a sua data de nascimento? (dd-mm-aaaa): ");
        String nascimento = leitor.next();

        LocalDate dataTotal = LocalDate.parse(nascimento, DateTimeFormatter.ofPattern("dd-MM-yyy"));
        System.out.println(dataTotal);
        
        LocalDate hoje = LocalDate.now();
        Period idade = Period.between(dataTotal, hoje);
        System.out.println("Você tem "+idade.getYears()+" anos de idade");
        
                
        System.out.println("Se você nasceu prematuro, foi concebido provavelmente em "+idade.minusMonths(7).getMonths());
        System.out.println("Se você não foi prematuro, foi concebido provavelmente em "+idade.minusMonths(9));

    }

}
