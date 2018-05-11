package app;

import enums.AgentePolinizador;
import enums.TipoFlor;
import java.util.Scanner;
import modelo.Flor;
import modelo.Girassol;
import modelo.Lirio;
import modelo.Produto;
import modelo.Rosa;

public class AppFloricultura {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        Flor flor1 = null;
        Flor flor2 = null;
        Produto produto1 = null;
        Produto produto2 = null;

        for (int a = 0; a < 2; a++) {

            System.out.println("Por favor, informe o nome da flor:");
            String nomeFlor = leitor.next();

            System.out.println("Por favor, informe o tipo da flor: \n"
                    + "1. Rosa \n"
                    + "2. Lirio \n"
                    + "3. Girassol");
            int tipoFlor = leitor.nextInt();

            System.out.println("Por favor, informe o tipo de polinização: \n"
                    + "1. Ornitófila \n"
                    + "2. Anemófila \n"
                    + "3. Quiropterófila \n"
                    + "4. Entomófilas \n"
                    + "5. Antropófila \n");
            int tipoPolinização = leitor.nextInt();

            System.out.println("Informe o código da flor (Números inteiros):");
            int id = leitor.nextInt();

            System.out.println("Informe o valor de compra da flor:");
            double valorCompra = leitor.nextDouble();

            System.out.println("Informe a raridade da flor: \n"
                    + "1. Comum \n"
                    + "2. Nobre \n"
                    + "3. Rara");
            int raridadeFlor = leitor.nextInt();

            AgentePolinizador tpPoli = null;
            switch (tipoPolinização) {
                case 1:
                    tpPoli = AgentePolinizador.ORNITOFILA;
                    break;
                case 2:
                    tpPoli = AgentePolinizador.ANEMOFILA;
                    break;
                case 3:
                    tpPoli = AgentePolinizador.QUIROTEROFILA;
                    break;
                case 4:
                    tpPoli = AgentePolinizador.ENTOMOFILAS;
                    break;
                case 5:
                    tpPoli = AgentePolinizador.ANTOPOFILA;
                    break;
            }

            TipoFlor tpFlor = null;
            switch (raridadeFlor) {
                case 1:
                    tpFlor = TipoFlor.COMUM;
                    break;
                case 2:
                    tpFlor = TipoFlor.NOBRE;
                    break;
                case 3:
                    tpFlor = TipoFlor.RARA;
                    break;
            }

            if (tipoFlor == 1) {
                if (a == 0) {
                    flor1 = new Rosa(nomeFlor, tpPoli);
                } else {
                    flor2 = new Rosa(nomeFlor, tpPoli);
                }
            }

            if (tipoFlor == 2) {
                if (a == 0) {
                    flor1 = new Lirio(nomeFlor, tpPoli);
                } else {
                    flor2 = new Lirio(nomeFlor, tpPoli);
                }
            }

            if (tipoFlor == 3) {
                if (a == 0) {
                    flor1 = new Girassol(nomeFlor, tpPoli);
                } else {
                    flor2 = new Girassol(nomeFlor, tpPoli);
                }
            }

            if (a == 0) {
                produto1 = new Produto(id, flor1, valorCompra, tpFlor);
            } else {
                produto2 = new Produto(id, flor2, valorCompra, tpFlor);
            }

        }

        System.out.println("A primeira flor cadastrada chama-se " + produto1.getFlor().getNome() + ", foi " + produto1.getFlor().getAgentePolinizador().getDescricao() + ",\n"
                + " o preço de compra é R$" + produto1.getValorCompra() + ", e o valor de venda é R$" + produto1.getPrecoVenda());
        System.out.println("A segunda flor cadastrada chama-se " + produto2.getFlor().getNome() + ", foi " + produto2.getFlor().getAgentePolinizador().getDescricao() + ",\n"
                + " o preço de compra é R$" + produto2.getValorCompra() + ", e o valor de venda é R$" + produto2.getPrecoVenda());

    }

}
