package br.com.henrique.modelo;

public class Lutador {

    private String nome;
    private int forca;
    private int vida = 100;

    public void socoFraco() {
        System.out.println("Dando soco fraco com a força " + (this.forca / 2));
    }

    public void socoForte() {

        System.out.println("Dando soco forte com a força " + this.forca);
    }

    public void chuteForte() {

        System.out.println("Dando chute forte com a força " + this.forca);
    }

    public void chuteFraco() {

        System.out.println("Dando chute forte com a força " + (this.forca / 2));
    }

    public void receberGolpe(int g) {
        System.out.println("Lutador perdendo " + g + " de vida");
        this.vida -= g;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the forca
     */
    public int getForca(int f) {
        return forca;
    }

    /**
     * @param forca the forca to set
     */
    public void setForca(int forca) {
        this.forca = forca;
    }

    /**
     * @return the vida
     */
    public int getVida() {
        return vida;
    }

}
