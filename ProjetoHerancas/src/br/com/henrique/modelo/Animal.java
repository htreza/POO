package br.com.henrique.modelo;

public class Animal {

    private String sexo;
    private double peso;
    private int idade;

    //construtor quem invoca o metodo nascer
    public Animal() {
        this.nascer();
    }

    // metodo protected - só pode ser invocado da propria classe ou das suas subs
    protected void nascer() {
        System.out.println("Animal nasceu...");
    }

    public void comer(String alimento) {
        System.out.println("Animal comendo " + alimento);
    }

    public String emitirSom() {
        return "Som do animal..";
    }

    /**
     * @return the sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the peso
     */
    public double getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

}
