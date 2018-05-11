package modelo;

import enums.AgentePolinizador;

public class Rosa extends Flor {

    public Rosa(String nome, AgentePolinizador agentePolinizador) {
        super(nome, agentePolinizador);
    }

    @Override
    String getCorPetalas() {
        return "Vermelho";
    }

}
