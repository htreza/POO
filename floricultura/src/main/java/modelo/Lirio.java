package modelo;

import enums.AgentePolinizador;

public class Lirio extends Flor {

    public Lirio(String nome, AgentePolinizador agentePolinizador) {
        super(nome, agentePolinizador);
    }

    @Override
    String getCorPetalas() {
        return "Branco";
    }

}
