package br.com.excecoes;

public class PrecoInvalidoException extends Exception {

    @Override
    public String getMessage() {
        return "Valor não pode ser menor ou igual a 0";
    }
}
