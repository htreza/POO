package br.com.bandtec.app.AppBriga;

//Powered by Henrique Treza
import br.com.bandtec.modelo.Lutador.Lutador;
import br.com.bandtec.modelo.Lutador.LutadorForte;
import br.com.bandtec.modelo.Lutador.LutadorFraco;

public class AppBriga {

    public static void main(String[] args) {

        Lutador goku = new LutadorForte(100, 1000);
        Lutador cell = new LutadorFraco(100, 15);

        System.out.println("O Goku tem " + goku.getVida() + " de vida");

        System.out.println("O  Vegeta tem " + cell.getVida() + " de vida");

        goku.receberGolpe(cell.aplicarGolpe());
        goku.receberGolpe(cell.aplicarGolpe());
        goku.receberGolpe(cell.aplicarGolpe());
        goku.receberGolpe(cell.aplicarGolpe());

        System.out.println("O Goku ficou com " + goku.getVida() + " de vida");

        cell.receberGolpe(goku.aplicarGolpe());
        System.out.println("O Vegeta ficou com " + cell.getVida() + " de vida");
    }

}
