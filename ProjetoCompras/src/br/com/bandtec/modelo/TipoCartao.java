package br.com.bandtec.modelo;
 
//Powered by Henrique Treza
public enum TipoCartao {
    
    CREDITO("Crédito"),
    DEBITO("Débito"),
    VR("Vale Refeição"),
    VA("Vale Alimentação");
  
    private String tipoCartao;

    private TipoCartao(final String tipoCartao) {
        this.tipoCartao = tipoCartao;
    }
    
    
    
    }
    
  
    

