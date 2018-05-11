package br.com.bandtec.app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class IdadeApp {

    public static void main(String[] args) throws ParseException {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Qual da data de fabricação do produto? (dd/mm/aaaa) : ");
        String dataFabricacao = leitor.next();

        System.out.println("Quanto dias tem de validade? : ");
        String validade = leitor.next();

        Date dataFeito = new SimpleDateFormat("dd/MM/yyyy").parse(dataFabricacao);
        System.out.println(dataFeito);
        
        
        

    }

}
