
package br.com.bandtec.enums;

// criado como classe normal, renomeado como enum
public enum RendaFamiliar {
    
    //a ordem dos elementos do enum não altera a execução
    //pode ter quantos atributos(caracteristicas) necessarios, de qualquer tipo
    CLASSE_E("Miserável",0.0,200.0),
    CLASSE_D("Pobre",200.01,940.0),
    CLASSE_C("Classe Média",940.01,1800.0),
    CLASSE_B("Classe Média Alta",1800.01,10000.0),
    CLASSE_A("Classe Média",10000.0,null);
    
    //atributos (com classes) na ordem dos parametros dos enums
    private String descricao;
    private Double minimo;
    private Double maximo;

    //construtor obrigatorio, com parametros na ordem dos paramentros dos enums
    private RendaFamiliar(String descricao, Double minimo, Double maximo) {
        this.descricao = descricao;
        this.minimo = minimo;
        this.maximo = maximo;
    }

    public String getDescricao() {
        return descricao;
    }

    public Double getMinimo() {
        return minimo;
    }

    public Double getMaximo() {
        return maximo;
    }
    
    
    
}
