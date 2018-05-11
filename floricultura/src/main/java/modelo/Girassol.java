package modelo;

import enums.AgentePolinizador;

public class Girassol extends Flor {

    public Girassol(String nome, AgentePolinizador agentePolinizador) {
        super(nome, agentePolinizador);
    }

    @Override
    String getCorPetalas() {
        return "Amarelo";
    }
}
