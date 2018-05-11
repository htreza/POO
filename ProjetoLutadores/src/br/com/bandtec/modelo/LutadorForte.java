
package br.com.bandtec.modelo;


public class LutadorForte extends Lutador {

    //caso filha da classe abstrata deve obrigatoriamente sobreescrever o construtor 
    public LutadorForte(double vida, double forca) {
        super(vida, forca);
    }

    @Override
    public double aplicarGolpe() {
        return this.forca * 3;
        
    }
    
    
    
}
