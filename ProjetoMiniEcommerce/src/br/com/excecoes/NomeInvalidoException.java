
package br.com.excecoes;


public class NomeInvalidoException extends Exception {
    
    @Override
    public String getMessage(){
        return "Nome não pode ter menos de 3 caracteres ou ser nulo";
    }
    
}
