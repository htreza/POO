package br.com.bandtec.app.AppJogoBriga;

//Powered by Henrique Treza
import br.com.bandtec.modelo.Lutador.Lutador;
import br.com.bandtec.modelo.Lutador.LutadorForte;
import br.com.bandtec.modelo.Lutador.LutadorFraco;
import java.util.Scanner;

public class AppJogoBriga {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Qual a força do Bison? ");
        int forcaBison = leitor.nextInt();
        System.out.println("Qual a vida do Bison? ");
        int vidaBison = leitor.nextInt();

        System.out.println("Qual a força do Ken? ");
        int forcaKen = leitor.nextInt();
        System.out.println("Qual a vida do Ken? ");
        int vidaKen = leitor.nextInt();

        Lutador ken = new LutadorForte(vidaKen, forcaKen);
        Lutador bison = new LutadorFraco(vidaBison, forcaBison);

       
        int golpek = 0;
        int golpeb = 0;

        while (bison.isVivo() && ken.isVivo()) {
            System.out.println("Quem deferiu o golpe? Ken ou Bison");
            String porrada = leitor.next();

            if (porrada.equalsIgnoreCase("Ken")) {
                bison.receberGolpe(ken.aplicarGolpe());
                System.out.println("A Vida do Bison ficou em " + bison.getVida());
                golpek++;
            } else {
                ken.receberGolpe(bison.aplicarGolpe());
                System.out.println("A vida do Ken ficou em " + ken.getVida());
                golpeb++;
            }

        }
        String campeao = ken.isVivo() ? "Ken" : "Bison";
        int contador = ken.isVivo() ? golpek : golpeb;
        System.out.println("K.O! Lutador " + campeao + " venceu após aplicar "+contador+ " golpes");

            
    }
}
