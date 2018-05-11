package br.com.bandtec.modelo;

//Powered by Henrique Treza

import br.com.bandtec.excecoes.DepositoInvalidoException;
import br.com.bandtec.excecoes.ValorInicialInvalidoException;

public class Cofrinho {

    private double valor;

    private boolean quebrado = false;

    //Construtor com valor inicial no cofrinho
    public Cofrinho(double valor) throws ValorInicialInvalidoException {
         if (valor < 0) {
            //"Throw ..." FINALIZA o método
            // Dizemos que "Lançamos uma exceção
            throw new ValorInicialInvalidoException();  
    }
      this.valor = valor;
        }
         

    // "Throws Exception" Indica que o método informa a  quem for usá-lo que pode lançar uma "Exception"
    public void depositar(double valorDeposito) throws DepositoInvalidoException {

        if (this.quebrado) {
            //"Throw ..." FINALIZA o método
            // Dizemos que "Lançamos uma exceção
            throw new DepositoInvalidoException("Cofre quebrado!!");
        }

        if (valorDeposito < 0) {
            //"Throw ..." FINALIZA o método
            // Dizemos que "Lançamos uma exceção
            throw new DepositoInvalidoException("Valor não pode ser < 0");
        }

        this.valor += valorDeposito;

    }

    public void quebrar() {
        this.quebrado = true;
    }

    public double getValor() {
        return valor;
    }

}
