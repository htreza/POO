package br.com.bandtec.estabelecimentosjpa.utils;

import java.util.Scanner;

//classe para criar um menu de entrada de dados
public class IOUtils {

    // 2 metodos criados por principio S do Solid
    // para reduzir repetição de codigos
    private static void mensagem(String mensagem) {
        System.out.println(mensagem + ":");

    }

    private static Scanner getLeitor(String mensagem) {
        mensagem(mensagem);
        return new Scanner(System.in);
    }

    public static String lerString(String mensagem) {
        return getLeitor(mensagem).nextLine();
    }

    public static int lerInt(String mensagem) {
        return getLeitor(mensagem).nextInt();
    }

    public static double lerDouble(String mensagem) {
        return getLeitor(mensagem).nextDouble();
    }

   
    
    
}
