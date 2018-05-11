package br.com.bandtec.modelo.Lutador;

//Powered by Henrique Treza
public abstract class Lutador {

    private double vida;
    protected double forca;

    public Lutador(double vida, double forca) {
        this.vida = vida;
        this.forca = forca;

    }

    public double getVida() {
        return this.vida;

    }

    public void receberGolpe(double forcaGolpe) {

        if (this.vida < forcaGolpe) {
            this.vida = 0;
        } else {
            this.vida -= forcaGolpe;
        }
    }

    /*
      solução em 1 linha
      this.vida = this.vida <= forcaGolpe ? 0 : this.vida - forcaGolpe;
      
      outra solução em 1 linha
      this.vida -= Math.min(this.vida, forcaGolpe);
     */
    //Quando ntemos um retorno boolean, podemos usar "is" ao invés de "GET"
    public boolean isVivo(){
        return this.vida > 0;
    }
    
    public boolean isDead(){
        return this.vida == 0;
        /*
        OU return !isVivo();
        */
    }
    public abstract double aplicarGolpe();

}
