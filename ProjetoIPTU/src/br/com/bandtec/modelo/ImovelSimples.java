package br.com.bandtec.modelo;

public class ImovelSimples extends Imovel {

    @Override
    double getValorReal() {
        return (getValor() * TAXA_SIMPLES)/100;
    }

}
