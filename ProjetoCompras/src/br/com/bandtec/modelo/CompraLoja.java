
package br.com.bandtec.modelo;


public class CompraLoja extends Compra {
    
    public CompraLoja(Integer id, Double valorTotal, TipoCartao tipoCartaPagamento)throws TipoPagamentoInvalidoException{
        super(id, valorTotal, tipoCartaPagamento);
        
        if(tipoCartaPagamento == TipoCartao.VA || tipoCartaPagamento == TipoCartao.VR){
            
            throw new TipoPagamentoInvalidoException();
        }
        
    }
    
    
    
}
