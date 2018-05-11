
package br.com.bandtec.modelo;


public class LutadorFraco extends Lutador{

    //caso filha da classe abstrata deve obrigatoriamente sobreescrever o construtor
    public LutadorFraco(double vida, double forca) {
        super(vida, forca);
    }

    @Override
    public double aplicarGolpe() {
        return this.forca * 0.8 ;
        
    }
    
}
