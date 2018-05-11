package br.com.bandtec.modelo;

public class ImovelLuxo extends Imovel {

    @Override
    double getValorReal() {
        return (getValor() * TAXA_LUXO)/100;
        
    }

}
