
package br.com.bandtec.excecoes;


public class DepositoInvalidoException extends Exception {

    // construtor (alt+insert) gerado pelos construtore padrao da superclasse 
    //isso obriga a passar uma String nos objetos criados na outras classes
    public DepositoInvalidoException(String message) {
        super(message);
    }
    
    
    
    
}
