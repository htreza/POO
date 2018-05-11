package br.com.bandtec.app;

 // Powered by Henrique Treza
import br.com.bandtec.modelo.Boletim;
import br.com.bandtec.modelo.BoletimBonzinho;
import br.com.bandtec.modelo.BoletimMalvado;


public class AppBoletins {
    
    public static void main(String[] args) {
        
        Boletim meuBoletim = new BoletimBonzinho(8,9);
        Boletim meuOutroBoletim = new BoletimMalvado(3,5);
        
        /*
        Boletim boletimTosco = new Boletim();
        Assim como classes abstratas, interfaces não podem ser instanciados.
        */
    
    if (meuBoletim.isAprovado()) {
        System.out.println("O 'meuBoletim' foi APROVADO!!!");
    }else {
        System.out.println("O 'meuBoletim' deu RUIM!!!");
    }
    
    if (meuOutroBoletim.isAprovado()) {
        System.out.println("O 'meuOutroBoletim' foi APROVADO!!!");
    }else {
        System.out.println("O 'meuOutroBoletim' deu RUIM!!!");
    }
    }
    
}
