package br.com.bandtec.modelo;

//Powered by Henrique Treza
public abstract class Imovel {

    private double valor;
    
    public static double TAXA_LUXO = 30;
    public static double TAXA_SUPERLUXO = 40;
    public static double TAXA_SIMPLES = 10;

    abstract double getValorReal();
    
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    

}
