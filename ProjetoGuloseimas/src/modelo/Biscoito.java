

package modelo;



public class Biscoito {
    
    private String sabor;
    private double peso;
    private double caloriasPorUnidade;
    private double preco;

    //metodo construtor 1
    public Biscoito(String sabor, double peso, double caloriasPorUnidade, double preco) {
        this.sabor = sabor;
        this.peso = peso;
        this.caloriasPorUnidade = caloriasPorUnidade;
        this.preco = preco;
    }
    
    public Biscoito(double peso) {
        this.peso = peso;
        
    }
    

    /**
     * @return the sabor
     */
    public String getSabor() {
        return sabor;
    }

    /**
     * @param sabor the sabor to set
     */
    public void setSabor(String sabor) {
        this.sabor = sabor;
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
     * @return the caloriasPorUnidade
     */
    public double getCaloriasPorUnidade() {
        return caloriasPorUnidade;
    }

    /**
     * @param caloriasPorUnidade the caloriasPorUnidade to set
     */
    public void setCaloriasPorUnidade(double caloriasPorUnidade) {
        this.caloriasPorUnidade = caloriasPorUnidade;
    }

    /**
     * @return the preco
     */
    public double getPreco() {
        return preco;
    }
    
    
    
}
