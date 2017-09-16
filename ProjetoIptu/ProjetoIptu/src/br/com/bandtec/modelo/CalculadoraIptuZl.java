package br.com.bandtec.modelo;

//Powered by Henrique Treza
public class CalculadoraIptuZl implements CalculadoraIPTU {

    @Override
    public double getValorIPTU(double valorImovel) {
    return valorImovel * 0.04;    
    }

    
}
