package modelo;

import enums.AgentePolinizador;


public abstract class Flor {
    
    private String nome;
    private AgentePolinizador agentePolinizador;

    public Flor(String nome, AgentePolinizador agentePolinizador) {
        this.nome = nome;
        this.agentePolinizador = agentePolinizador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public AgentePolinizador getAgentePolinizador() {
        return agentePolinizador;
    }

    public void setAgentePolinizador(AgentePolinizador agentePolinizador) {
        this.agentePolinizador = agentePolinizador;
    }
    
    abstract String getCorPetalas();
    

}
