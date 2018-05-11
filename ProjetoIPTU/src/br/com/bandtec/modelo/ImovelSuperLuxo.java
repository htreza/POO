package br.com.bandtec.modelo;

public class ImovelSuperLuxo extends ImovelLuxo {

    @Override
    double getValorReal() {
        return (getValor() * TAXA_SUPERLUXO) / 100;
    }

}
