package br.com.bandtec.modelo;

//Powered by Henrique Treza
public class BoletimMalvado implements Boletim {

    private double nota1;
    private double nota2;

    @Override
    public boolean isAprovado() {
        return (this.nota1 + this.nota2) / 2 >= 8;
    }

    public BoletimMalvado(double nota1, double nota2) {
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

}
