package br.com.bandtec.modelo;

public class CalculadoraIPTUZL implements CalculardoraIPTU {

    @Override
    public double getValorIPTU(double valorImovel) {
        return valorImovel * 0.04;

    }

}
