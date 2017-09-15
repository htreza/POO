package br.com.bandtec.app;

//Powered by Henrique Treza
import br.com.bandtec.modelo.Pessoa;
import java.util.HashMap;
import java.util.Map;

public class AppFormulariosPessoas {

    public static void main(String[] args) {

        Map<String, Pessoas> formPessoa = new HashMap<>();
        
        formPessoa.put("chefe", new Pessoas("Hommer",40));
        formPessoa.put("gerente", new Pessoas("Maria",45));
        formPessoa.put("estagiário", new Pessoas("Bob",22));
    }

}
