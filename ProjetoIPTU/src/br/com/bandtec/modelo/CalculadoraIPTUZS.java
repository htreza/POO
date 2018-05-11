package br.com.bandtec.modelo;

public class CalculadoraIPTUZS implements CalculardoraIPTU {

    @Override
    public double getValorIPTU(double valorImovel) {
        return valorImovel * 0.02;

    }

}
