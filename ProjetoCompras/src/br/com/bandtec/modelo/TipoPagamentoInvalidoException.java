package br.com.bandtec.modelo;
 
//Powered by Henrique Treza
public class TipoPagamentoInvalidoException extends Exception{
    

    public String getMessage(){
        return  "Tipo de pagamento inválido. Só aceitamos Crédito e Débito";
    }
    
}
