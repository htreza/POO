package br.com.bandtec.modelo.Lutador;

//Powered by Henrique Treza
public class LutadorFraco extends Lutador {

    public LutadorFraco(double vida, double forca) {
        super(vida, forca);
    }

    @Override
    public double aplicarGolpe() {
        return this.forca * 0.8;

    }

}
