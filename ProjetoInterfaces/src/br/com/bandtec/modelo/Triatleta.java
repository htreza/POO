package br.com.bandtec.modelo;

//Powered by Henrique Treza
public class Triatleta implements Corredor,Ciclista, Nadador{

    @Override
    public void correr() {
        System.out.println("Triatleta correndo...");    
    }

    @Override
    public void pedalar() {
        System.out.println("Triatleta pedalando...");    
    }

    @Override
    public void nadar() {
        System.out.println("Triatleta nadando");    
    }

    
}
