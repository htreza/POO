package br.com.flavio.modelo;

public class Atacante extends JogadorFutebol {

    @Override
    public void chutar() {
        System.out.println("marca gol");
    }

    @Override
    public void aquecer() {
        System.out.println("enrolando");
    }

}
