package br.com.app;

import br.com.excecoes.NomeInvalidoException;
import br.com.excecoes.PrecoInvalidoException;
import br.com.modelo.Produto;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AppLoja {

    public static void main(String[] args) {

        try {
            Produto produto2 = new Produto("Maria", 50);

            System.out.println(produto2.getNome());

            Produto produto1 = new Produto("eu", -100);

        } catch (NomeInvalidoException exa) {
            System.out.println("Nome muito pequeno " + exa.getMessage());
        } catch (PrecoInvalidoException exb) {
            System.out.println("Valor invalido " + exb.getMessage());
        }

    }

}
