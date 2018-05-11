package br.com.bandtec.modelo;
 
//Powered by Henrique Treza
public class Compra {
    
   private final Integer id;
   private final Double valorTotal;
   private final TipoCartao tipoCartaoPagamento;

    public Compra(Integer id, Double valorTotal, TipoCartao tipoCartaoPagamento) {
        this.id = id;
        this.valorTotal = valorTotal;
        this.tipoCartaoPagamento = tipoCartaoPagamento;
    }

    
    public Integer getId() {
        return id;
    }

    
    public Double getValorTotal() {
        return valorTotal;
    }

    
    public TipoCartao getTipoCartaoPagamento() {
        return tipoCartaoPagamento;
    }
    
}
