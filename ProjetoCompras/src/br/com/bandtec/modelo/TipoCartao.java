
package br.com.bandtec.modelo;


public enum TipoCartao {
    
    CREDITO("Crédito"),
    DEBITO("Débito"),
    VR("Vale Refeição"),
    VA("Vale Alimentação");
    
    private String tipoCartao;

    private TipoCartao(String tipoCartao) {
        this.tipoCartao = tipoCartao;
    }

    public String getTipoCartao() {
        return tipoCartao;
    }

    public void setTipoCartao(final String tipoCartao) {
        this.tipoCartao = tipoCartao;
    }
    
    
    
    
}
