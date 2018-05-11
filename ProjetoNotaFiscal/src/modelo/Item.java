

package modelo;



public class Item {
    
    private String decricao;
    private int quantidade;
    private double valorUnitario;
    
    //criando o construtor da classe Item (alt + insert)

    public Item(String decricao, int quantidade, double valorUnitario) {
        this.decricao = decricao;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
    }
    
    
    

    //crianto o metodo get para calcular o valor total
    public double getValorTotal(){
        return this.valorUnitario * this.quantidade;
        
    }
    
    /**
     * @return the decricao
     */
    public String getDecricao() {
        return decricao;
    }

    /**
     * @param decricao the decricao to set
     */
    public void setDecricao(String decricao) {
        this.decricao = decricao;
    }

    /**
     * @return the quantidade
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * @return the valorUnitario
     */
    public double getValorUnitario() {
        return valorUnitario;
    }

    /**
     * @param valorUnitario the valorUnitario to set
     */
    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }
    
    
    
}
