package modelo;

public class Poupanca {

    private double saldo;
    private double taxa;
    private String titular;

    public void aplicar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
        }

    }

    //metodo pulico de acesso ao atributo privado
    public double saldo() {
        return this.saldo;
    }

    public void atualizarTitular(String nomeTitular) {
        this.titular = nomeTitular;
    }

    public String titular() {
        return this.titular;
    }

    public void atualizarTaxa(double novaTaxa) {
        if (novaTaxa > 0) {
            this.taxa = novaTaxa;
        }

    }

    public void render() {
        this.saldo *= 1 + (this.taxa / 100) ;

    }

}
