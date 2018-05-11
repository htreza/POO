
package br.com.bandtec.modelo;

import br.com.bandtec.enums.FaixaEtaria;
import br.com.bandtec.enums.RendaFamiliar;


public class Cliente {
    
    private String nome;
    //atributo criado como sendo do tipo enum FaixaEtaria
    private FaixaEtaria faixaEtaria;
    
    private RendaFamiliar rendaFamiliar;

    //construtor
    public Cliente(String nome, FaixaEtaria faixaEtaria) {
        this.nome = nome;
        this.faixaEtaria = faixaEtaria;
    }

    public String getNome() {
        return nome;
    }

    public FaixaEtaria getFaixaEtaria() {
        return faixaEtaria;
    }

    public RendaFamiliar getRendaFamiliar() {
        return rendaFamiliar;
    }

    public void setRendaFamiliar(RendaFamiliar rendaFamiliar) {
        this.rendaFamiliar = rendaFamiliar;
    }
    
    
    
    
    
    
    
}
