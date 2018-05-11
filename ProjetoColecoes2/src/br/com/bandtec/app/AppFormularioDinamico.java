package br.com.bandtec.app;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AppFormularioDinamico {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        // O HashMap ordena os elementos a partir do Hash da chave
        // caso seja instanciado como LinkedHashMap, ordena pela sequencia de cadastro
        Map<String, Object> formulario = new LinkedHashMap<>();

        //while infinito
        while (true) {
            System.out.println("Campo");
            String campo = leitor.next();

            System.out.println("Valor");
            String valor = leitor.next();

            formulario.put(campo, valor);

            System.out.println("Digite 1 para mais campos");
            int resp = leitor.nextInt();
            if (resp != 1) {
                break; //para sair do while (ou for)
            }
        }
        System.out.println("Formulario: "+formulario);
    }
}
