package br.com.bandtec.app;

//Powered by Henrique Treza
import java.util.HashMap;
import java.util.Map;

public class AppFormulariosComplexos {

    public static void main(String[] args) {

        Map<String, Object> formPrincipal = new HashMap<>();
        Map<String, Object> formTelefones = new HashMap<>();

        formPrincipal.put("nome", "Zé Ruela");
        formPrincipal.put("nascimento", "01/01/2000");
        formPrincipal.put("bairro", "Itaquera");
        
        formTelefones.put("telefone1", "2222-2222");
        formTelefones.put("telefone2", "5555-5555");
        formTelefones.put("telefone3", "8888-9999");
        
        formPrincipal.put("telefones", formTelefones);
        
        System.out.println(formPrincipal);
        
    }

}
