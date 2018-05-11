package br.com.bandtec.app;

//Powered by Henrique Treza

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AppFormularioDinamico {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        
        //O "HashMap" ordena seus elementos
        //a partir do Hash da chave
        
        //Para que o mapa armazene na mesma ordem de cadastro
        //deve-se usar a implementação LinkedHashMap
        Map<String, Object> formulario = new HashMap<>();
        
        while(true) {
            System.out.println("campo");
            String campo = leitor.next();
            
            System.out.println("valor");
            String valor = leitor.next();
            
            formulario.put(campo, valor);
            
            System.out.println("Digite 1 para mais campos");
            int resp = leitor.nextInt();
            if(resp!=1){
                break;//o break SAI do "while" (ou do "for")
            }
        }
        System.out.println("Formulario: "+formulario);
    }

}
