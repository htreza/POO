package br.com.bandtec.App;

import br.com.bandtec.modelo.Boletim;
import br.com.bandtec.modelo.BoletimBonzinho;
import br.com.bandtec.modelo.BoletimMalvado;

public class AppBoletins {

    public static void main(String[] args) {

        Boletim meuBoletim = new BoletimBonzinho(7, 8);
        Boletim outroBoletim = new BoletimMalvado(3, 5);
        
        //não é possivel criar objetos instanciados de uma Interface
        //Boletim boletimTosco = new Boletim;

        if (meuBoletim.isAprovado()) {
            System.out.println("o 'meuBoletim' foi aprovado");
        } else {
            System.out.println("o 'meuBoletim' deu jaz");
        }

        if (outroBoletim.isAprovado()) {
            System.out.println("o 'outroBoletim' foi aprovado");
        } else {
            System.out.println("o 'outroBoletim' deu jaz");
        }

    }

}
