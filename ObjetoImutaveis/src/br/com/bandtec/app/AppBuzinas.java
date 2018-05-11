package br.com.bandtec.app;

 //Powered by Henrique Treza
import br.com.bandtec.modelo.Buzina;


public class AppBuzinas {
    
    public static void main(String[] args) {
        //Para criar Uma classe anonima, bastar importar
        //o método e deixar ponto e virgula após a chave.
        //Para criar uma classe anônima, instanciamos criando um "Corpo"
        //Interno e sobrescrevendo os método
        //Que desejamos e/ou precisamos.
        Buzina buzinaFraca = new Buzina(){
            @Override
            public String buzinar() {
            return "Biiiiii";    
            }
            
        
        };
        System.out.println("buzinaFraca: "+buzinaFraca.buzinar());
        
        Buzina buzinaBarulhenta = new Buzina() {
            @Override
            public String buzinar() {
            return "FOFOOOOOOOOOOOOOOOOOOOOOOO";    
            }
        };
        System.out.println("buzinaBarulhenta: "+buzinaBarulhenta.buzinar());
    }
}
