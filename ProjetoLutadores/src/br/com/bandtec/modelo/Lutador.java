package br.com.bandtec.modelo;

public abstract class Lutador {

    private double vida = 0;
    protected double forca;

    //construtor
    public Lutador(double vida, double forca) {
        this.vida = vida;
        this.forca = forca;
    }

    //metodo get
    public double getVida() {
        return vida;
    }

    public void receberGolpe(double pancada) {
        if (this.vida < pancada) {
            this.vida = 0;
        } else {
            this.vida -= pancada;
        }

        // 2 outras solucoes em uma linha somente  
        
        //operador ternario  
        //this.vida = this.vida <= pancada ? 0 : this.vida - pancada;
        
        //com metodo da classe Math
        //this.vida -= Math.min(this.vida,pancada)
    }

    // o metodos com return Boolean podem ter a  opcao "is", no lugar de get
    public boolean isVivo(){
        return this.vida > 0;
    }
    
    public boolean isMorto(){
        return this.vida == 0;
        // OU return !isVivo();
        
    }
    
    public abstract double aplicarGolpe();
    
   }
