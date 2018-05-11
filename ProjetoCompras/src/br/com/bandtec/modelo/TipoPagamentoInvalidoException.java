package br.com.bandtec.modelo;

public class TipoPagamentoInvalidoException extends Exception {

    public String getMessage() {
        return "Tipo de pagamento inválido. Só aceitamos Crédito e Débito";
    }
;
}
