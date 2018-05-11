package br.com.flavio.app;

import br.com.flavio.modelo.Atacante;
import br.com.flavio.modelo.JogadorFutebol;
import br.com.flavio.modelo.Lateral;
import br.com.flavio.modelo.Meia;
import br.com.flavio.modelo.Zagueiro;

public class AppFutebol {

    public static void main(String[] args) {

        //declarado de uma classe abstrato, instanciado de uma classe concreta
        JogadorFutebol jogador1 = new Zagueiro();
        jogador1.chutar();
        jogador1.aquecer();

        //declarado e instanciado de uma classe concreta
        Zagueiro jogadorZagueiro = new Zagueiro();
        jogadorZagueiro.chutar();
        jogadorZagueiro.aquecer();

        JogadorFutebol jogadorAtacante = new Atacante();
        jogadorAtacante.chutar();
        jogadorAtacante.aquecer();

        JogadorFutebol jogadorLateral = new Lateral();
        jogadorLateral.chutar();
        jogadorLateral.aquecer();

        JogadorFutebol jogadorMeia = new Meia();
        jogadorMeia.chutar();
        jogadorMeia.aquecer();

    }

}
