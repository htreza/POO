package br.com.bandtec.modelo;
 
//Powered by Henrique Treza
public class BoletimBonzinho implements Boletim {

/*
    Uma classe IMPLEMENTA, não estende uma interface
    por isso "implements" ao invés de "extends"
    Colocar IMPLEMENTS AO INVÉS DE EXTENDS, QUANDO FOR INTERFACE
     */
    public BoletimBonzinho(double nota1, double nota2) {
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    
    private double nota1;
    private double nota2;
    
    @Override
    public boolean isAprovado() {
    return (this.nota1 + this.nota2)/2 > 5;    
    }
    
    
}
