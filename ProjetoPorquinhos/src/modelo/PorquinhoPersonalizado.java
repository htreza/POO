

package modelo;



public class PorquinhoPersonalizado {
    
    private double valor;
    private String dono;

    //construtor (gerado com ALT+Insert)
    public PorquinhoPersonalizado(double valor, String dono) {
        this.valor = valor;
        this.dono = dono;
    }

    //get e set gerados para os metodos do construtor
    
    /**
     * @return the valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(double valor) {
        this.valor = valor;
    }

    /**
     * @return the dono
     */
    public String getDono() {
        return dono;
    }

    /**
     * @param dono the dono to set
     */
    public void setDono(String dono) {
        this.dono = dono;
    }
    
    
    
    
}
