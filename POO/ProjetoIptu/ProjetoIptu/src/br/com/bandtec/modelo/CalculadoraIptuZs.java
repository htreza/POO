package br.com.bandtec.modelo;

//Powered by Henrique Treza
public class CalculadoraIptuZs implements CalculadoraIPTU {

    @Override
    public double getValorIPTU(double valorImovel) {
    return valorImovel * 0.02;
    }

}
