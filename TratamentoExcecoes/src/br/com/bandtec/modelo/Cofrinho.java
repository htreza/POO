package br.com.bandtec.modelo;

//Powered by Henrique Treza
public class Cofrinho {

    private double valor;

    private boolean quebrado = false;

    //Construtor com valor inicial no cofrinho
    public Cofrinho(double valor) throws Exception {
         if (valor < 0) {
            //"Throw ..." FINALIZA o método
            // Dizemos que "Lançamos uma exceção
            throw new Exception("Não é possível depositar valor negativo");  
    }
      this.valor = valor;
        }
         

    // "Throws Exception" Indica que o método informa a  quem for usá-lo que pode lançar uma "Exception"
    public void depositar(double valorDeposito) throws Exception {

        if (this.quebrado) {
            //"Throw ..." FINALIZA o método
            // Dizemos que "Lançamos uma exceção
            throw new Exception("O cofrinho está quebrado :(");
        }

        if (valorDeposito < 0) {
            //"Throw ..." FINALIZA o método
            // Dizemos que "Lançamos uma exceção
            throw new Exception("Não é possível depositar valor negativo");
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
