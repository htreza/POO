package br.com.bandtec.modelo;

import br.com.bandtec.excecoes.DepositoInvalidoException;
import br.com.bandtec.excecoes.ValorInicialInvalidoException;

public class Cofrinho {

    private double valor;
    private boolean quebrado = false;

    //construtor  
    public Cofrinho(double valor) throws ValorInicialInvalidoException {
        
        if(valor < 0){
            throw new ValorInicialInvalidoException();
        }
        this.valor = valor;
    }

    //"thrws Exception" indica que o metodo informa ao user que pode gerar exceções
    //throw com assinatura a partir da classe DepositoInvalidoException
    public void depositar(double valorDeposito) throws DepositoInvalidoException {

         //regra de negocio
        if (this.quebrado){
            throw new DepositoInvalidoException("Cofre quebrado");
        }
        
        //regra de negocio
        if (valorDeposito < 0) {
            //"throw" FINALIZA o metodo,lançando uma exceção
            throw new DepositoInvalidoException("Valor não pode ser negativo");
        }
        this.valor += valorDeposito;

    }
    
    public void quebrar(){
        this.quebrado = true;
    }

    //metodo get padrao
    public double getValor() {
        return valor;
    }
    
    

}
