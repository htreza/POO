
package br.com.bandtec.app;

import java.util.HashMap;
import java.util.Map;


public class AppFormulariosComplexos {
    
    public static void main(String[] args) {
        
        Map<String, Object> formPrincipal = new HashMap<>();
        Map<String, Object> formTelefones = new HashMap<>();
        
        formPrincipal.put("nome", "Zé mané");
        formPrincipal.put("nascimento","1/1/2000");
        formPrincipal.put("bairro", "Sami");
        
        formTelefones.put("3374", "12234");
        formTelefones.put("297", "345");
        formTelefones.put("251", "409");
        
        //colocando um Map dentro de outro Map
        formPrincipal.put("telefones", formTelefones);
        
        System.out.println(formPrincipal);
        
    }
    
}
