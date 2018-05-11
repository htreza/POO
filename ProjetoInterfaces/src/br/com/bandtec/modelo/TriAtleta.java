
package br.com.bandtec.modelo;

// 3 implementações, com todos seus metodos
public class TriAtleta implements Corredor, Ciclista, Nadador  {

    @Override
    public void correr() {
        System.out.println("Triatleta correndo...");
    }

    @Override
    public void pedalar() {
        System.out.println("Triatleta Pedalando...");
    }

    @Override
    public void nadar() {
        System.out.println("nadando, nadando...");
    }
    
    
    
}
