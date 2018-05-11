
package br.com.bandtec.app;

import br.com.bandtec.modelo.Pessoa;
import java.util.HashMap;
import java.util.Map;


public class AppFormularioPessoas {
    
    public static void main(String[] args) {
        
        //adcionando um objeto Pessoa da classe Pessoa
        Map<String, Pessoa>formPessoas = new HashMap<>();
        
        //Objeto anonimo: criando um objeto já dentro do método
        formPessoas.put("chefe", new Pessoa("Homer",40));
        formPessoas.put("gerente", new Pessoa("Lisa",8));
        formPessoas.put("patroa", new Pessoa("Marge",40));
        
        System.out.println(formPessoas);
        
    }
    
}
