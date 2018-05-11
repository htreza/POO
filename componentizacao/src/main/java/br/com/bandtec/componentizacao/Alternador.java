package br.com.bandtec.componentizacao;

class Alternador {

    public double converteEnergia(double energiaMecanica) {

        //condição para não permitir energia negativa
        //colocar a regra na classe inicial
        if (energiaMecanica < 0) {
            throw new RuntimeException("não é possivel gerar negativa");
        }

        return energiaMecanica * 0.2;
    }

}
