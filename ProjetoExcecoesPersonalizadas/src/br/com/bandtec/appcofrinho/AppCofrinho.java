package br.com.bandtec.appcofrinho;

import br.com.bandtec.excecoes.DepositoInvalidoException;
import br.com.bandtec.excecoes.ValorInicialInvalidoException;
import br.com.bandtec.modelo.Cofrinho;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AppCofrinho {

    public static void main(String[] args) {

        try {
            Cofrinho cofrinhoBom = new Cofrinho(100);
            cofrinhoBom.depositar(5);
            cofrinhoBom.quebrar();
            cofrinhoBom.depositar(-5);
        } catch (ValorInicialInvalidoException ex) {
            System.out.println("Erro ao criar o cofre: " + ex.getMessage());
        } catch (DepositoInvalidoException plex) {
            System.out.println("Erro ao depositar: " + plex.getMessage());
        }

    }

}
