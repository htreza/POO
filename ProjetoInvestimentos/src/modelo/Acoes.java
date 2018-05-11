package modelo;

import java.util.Random;


public class Acoes {

    Random R = new Random();
    
    private String titular;
    private double saldo;

    public void atualizarTitular(String nomeTitular) {
        this.titular = nomeTitular;
    }

    public void recuperarTitular(String nomeTitular) {
        this.titular = nomeTitular;
    }

    public double saldo() {
        return this.saldo;
    }
    
    public void render() {
        this.saldo(R(2)*1);

    }

}
