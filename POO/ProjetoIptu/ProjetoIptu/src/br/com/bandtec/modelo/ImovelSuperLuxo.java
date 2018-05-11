package br.com.bandtec.modelo;

//Powered by Henrique Treza
public class ImovelSuperLuxo extends ImovelLuxo{
    
     @Override
    double getValorReal() {
    return (getValor()) *TAXA_SUPERLUXO/100;
    }
}
