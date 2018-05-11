

package modelo;



public class PorquinhoPapai {
    
    //atributos de instancias, já com valores iniciais atribuidos na declaração
    // toda instancia dessa classe já nasce com esses valores
    private double valor = 5;
    private String dono = "Filho inteligente!";
    
    // encapsulado: privado e recuperado por metodos publicos
    //set é sempre void
    // botao direito --> refatorar --> encapsular campos

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
    // retornar todos em maiuscula
    public String getDono() {
        return dono.toUpperCase();
    }

    /**
     * @param dono the dono to set
     */
    public void setDono(String dono) {
        this.dono = dono;
    }
    
    
}
