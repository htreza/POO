package br.com.bandtec.floricultura.app;

import br.com.bandtec.floricultura.enums.AgentePolinizador;
import br.com.bandtec.floricultura.enums.TipoFlor;
import br.com.bandtec.floricultura.modelo.Flor;
import br.com.bandtec.floricultura.modelo.Girassol;
import br.com.bandtec.floricultura.modelo.Lirio;
import br.com.bandtec.floricultura.modelo.Produto;
import br.com.bandtec.floricultura.modelo.Rosa;
import java.util.Scanner;

public class AppFloricultura {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // textos das perguntas com opções
        String especiesFlores = "Qual espécie de Flor? \n"
                + "1. Rosa \n"
                + "2. Lírio \n"
                + "3. Girassol ";

        String tiposFlores = "Qual tipo de Flor? \n"
                + "1. Comum \n"
                + "2. Nobre \n"
                + "3. Rara ";

        String agentesPolinizadores = "Qual o agente Polinizador? \n"
                + "1. Ornitófila \n"
                + "2. Anemófila \n"
                + "3. Quiropterófila \n"
                + "4. Entomófilas \n"
                + "5. Antropófila";

        for (int i = 0; i < 2; i++) {
            // solicitando os valores para o usuário
            System.out.println(especiesFlores);
            int especie = leitor.nextInt();

            System.out.println(tiposFlores);
            int tipo = leitor.nextInt();

            System.out.println(agentesPolinizadores);
            int agente = leitor.nextInt();

            AgentePolinizador agentePolinizador = null;
            switch (agente) {
                case 1:
                    agentePolinizador = AgentePolinizador.ORNITOFILA;
                    break;
                case 2:
                    agentePolinizador = AgentePolinizador.ANEMOFILA;
                    break;
                case 3:
                    agentePolinizador = AgentePolinizador.QUIROTEROFILA;
                    break;
                case 4:
                    agentePolinizador = AgentePolinizador.ENTOMOFILAS;
                    break;
                case 5:
                    agentePolinizador = AgentePolinizador.ANTOPOFILA;
                    break;
                default:
                    System.out.println("Valor inválido!");
                    System.exit(0);
            }

            TipoFlor tipoFlor = null;
            switch (tipo) {
                case 1:
                    tipoFlor = TipoFlor.COMUM;
                    break;
                case 2:
                    tipoFlor = TipoFlor.NOBRE;
                    break;
                case 3:
                    tipoFlor = TipoFlor.RARA;
                    break;
                default:
                    System.out.println("Valor inválido!");
                    System.exit(0);
            }

            System.out.println("Qual o nome da flor?");
            String nome = leitor.next();

            Flor flor = null;
            switch (especie) {
                case 1:
                    flor = new Rosa(nome, agentePolinizador);
                    break;
                case 2:
                    flor = new Lirio(nome, agentePolinizador);
                    break;
                case 3:
                    flor = new Girassol(nome, agentePolinizador);
                    break;
                default:
                    System.out.println("Valor inválido!");
                    System.exit(0);
            }

            System.out.println("Qual o código da flor?");
            Integer id = leitor.nextInt();

            System.out.println("Por quanto você comprou a flor?");
            double valorCompra = leitor.nextDouble();

            Produto produto = new Produto(id, flor, valorCompra, tipoFlor);

            System.out.println("Nome: " + produto.getFlor().getNome());
            System.out.println("Pétalas: " + produto.getFlor().getCorPetalas());

            System.out.println("Quem poliniza: "
                    + produto.getFlor().getAgentePolinizador().getDescricao());

            System.out.println("Você pagou: " + produto.getValorCompra());
            System.out.println("Você venderá por: " + produto.getPrecoVenda());
        }
    }

}
