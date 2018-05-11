package br.com.bandtec.modelo;

//Powered by Henrique Treza
public class ImovelSimples extends Imovel{

    @Override
    double getValorReal() {
        return (getValor()) * TAXA_SIMPLES/100;
        }
    
}
