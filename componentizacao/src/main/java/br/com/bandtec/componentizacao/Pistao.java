package br.com.bandtec.componentizacao;

public class Pistao {

    public void bombearCombustivel(double volume) {

        //condição para não permitir volume de combustivel negativo
        //colocar a regra na classe inicial
        if (volume < 0) {
            throw new RuntimeException("não é possivel bombear valor negativo");
        }
        System.out.println("Bombeando " + volume + " litros de combustivel");

    }

}
