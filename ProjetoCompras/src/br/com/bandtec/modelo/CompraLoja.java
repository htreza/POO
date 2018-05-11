package br.com.bandtec.modelo;

//Powered by Henrique Treza
public class CompraLoja extends Compra {

    public CompraLoja(Integer id, Double valorTotal, TipoCartao tipoCartaoPagamento) throws TipoPagamentoInvalidoException {
        super(id, valorTotal, tipoCartaoPagamento);
        
        if(tipoCartaoPagamento == TipoCartao.VR || tipoCartaoPagamento == TipoCartao.VA)
            throw new TipoPagamentoInvalidoException();
            }

}
