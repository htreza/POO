package br.com.bandtec.app;

import br.com.bandtec.modelo.Lutador;
import br.com.bandtec.modelo.LutadorForte;
import br.com.bandtec.modelo.LutadorFraco;
import java.util.Scanner;

public class AppJogoBriga {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int golpeM = 0;
        int golpeB = 0;

        System.out.print("Qual a vida do Maguila? : ");
        int vidaMaguila = leitor.nextInt();
        System.out.print("Qual a força do Maguila? : ");
        int forcaMaguila = leitor.nextInt();

        System.out.print("Qual a vida do Rock Balboa? : ");
        int vidaBalboa = leitor.nextInt();
        System.out.print("Qual a força do Rock Balboa? : ");
        int forcaBalboa = leitor.nextInt();

        Lutador maguila = new LutadorFraco(vidaMaguila, forcaMaguila);
        Lutador balboa = new LutadorForte(vidaBalboa, forcaBalboa);

        // laço for ==> quando um numero "especifico"  de repeticao
        // laço while ==> repete em um contexto determinado
        while (maguila.isVivo() && balboa.isVivo()) {
            System.out.println("Quem deu a porrada? Maguila ou Balboa ");
            String bateu = leitor.next();

            if (bateu.equalsIgnoreCase("Maguila")) {
                balboa.receberGolpe(maguila.aplicarGolpe());
                System.out.println("A vida do Rock Balboa está em " + balboa.getVida());
                golpeM++;
            } else {
                maguila.receberGolpe(balboa.aplicarGolpe());
                System.out.println("A vida do Maguila está em " + maguila.getVida());
                golpeB++;
            }

        }

        String vencedor = maguila.isVivo() ? "Maguila" : "Balboa";
        int contador = maguila.isVivo() ? golpeM : golpeB;
        System.out.println("K.O.! Lutador " + vencedor + " venceu após aplicar " + contador + " golpe(s)");

    }

}
