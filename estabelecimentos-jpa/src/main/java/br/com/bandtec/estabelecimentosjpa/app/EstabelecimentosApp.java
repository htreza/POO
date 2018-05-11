package br.com.bandtec.estabelecimentosjpa.app;

import br.com.bandtec.estabelecimentosjpa.db.Conexao;
import br.com.bandtec.estabelecimentosjpa.model.TipoEstabelecimento;
import br.com.bandtec.estabelecimentosjpa.repository.TipoEstabelecimentoRepository;
import br.com.bandtec.estabelecimentosjpa.utils.IOUtils;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class EstabelecimentosApp {

    public static void main(String[] args) {
        try {

            MenuPrincipal.executar();

        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        } finally {
            System.exit(0);
        }
    }

}
