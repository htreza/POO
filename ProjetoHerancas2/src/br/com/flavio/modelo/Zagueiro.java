package br.com.flavio.modelo;

// subclasse da classe JogadorFutebol, é uma implementaçao deste
public class Zagueiro extends JogadorFutebol {

    //implementação obrigatoria
    @Override
    public void chutar() {
        System.out.println("zagueiro dando um chutão");
    }

}
