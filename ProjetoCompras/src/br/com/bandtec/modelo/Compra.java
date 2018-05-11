
package br.com.bandtec.modelo;


public class Compra {
    
    protected final Integer id;
    protected final Double valorTotal;
    protected final TipoCartao tipoCartaPagamento;

    //constutor
    public Compra(Integer id, Double valorTotal, TipoCartao tipoCartaPagamento) {
        this.id = id;
        this.valorTotal = valorTotal;
        this.tipoCartaPagamento = tipoCartaPagamento;
    }

    public Integer getId() {
        return id;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public TipoCartao getTipoCartaPagamento() {
        return tipoCartaPagamento;
    }
    
    
    
}
