
package br.com.bandtec.app;

import br.com.bandtec.modelo.Buzina;


public class AppBuzinas {
    
    public static void main(String[] args) {
        
        //para criar uma classe anônima, é preciso instanciar criando um "corpo" interno
        // e sobrescrever os métodos que desejamos/precisamos
        // É necessário deixar o ; ponto-virgula após a classe
        Buzina buzinaFraca = new Buzina() {
            @Override
            public String buzinar() {
                return "fiuuuu";
            }
        };
        
        System.out.println("buzinaFraca faz "+buzinaFraca.buzinar());
        
        // no NetBeans o ctrl+espaço já faz a criação dessa estrutura
        //visualmente se parece como uma classe dentro de outro
        Buzina buzinaBarulhenta = new Buzina() {
            @Override
            public String buzinar() {
                return "fiufiu";
            }
        };
        
    }
    
}
