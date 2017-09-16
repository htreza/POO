package br.com.bandtec.modelo;

//Powered by Henrique Treza
public class ImovelLuxo extends Imovel{

    @Override
    double getValorReal() {
        return (getValor()) * TAXA_LUXO/100;
        }
    
}
