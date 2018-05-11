package br.com.bandtec.floricultura.modelo;

import br.com.bandtec.floricultura.enums.AgentePolinizador;

public class Rosa extends Flor {

    public Rosa(String nome, AgentePolinizador agentePolinizador) {
        super(nome, agentePolinizador);
    }

    @Override
    public String getCorPetalas() {
        return "vermelho";
    }
    
}
