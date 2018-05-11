package br.com.henrique.app;

import br.com.henrique.modelo.Animal;
import br.com.henrique.modelo.Cachorro;
import br.com.henrique.modelo.Gato;

public class AppAnimais {
    
    public static void main(String[] args) {

        //nova instancia do objeto Animal
        Animal bichinho1 = new Animal();

        //metodo comer
        bichinho1.comer("ração");

        //metodo Strig emitirSom
        System.out.println(bichinho1.emitirSom());

        //nova instancia de Gato
        Gato bichano = new Gato();

        //
        bichano.comer("rato");
        System.out.println("O gato " + bichano.emitirSom());

        //atribuindo um valor ao atributo idade
        bichano.setIdade(10);
        bichano.cuspirBolaDePelo();
        
        System.out.println("o gato tem " + bichano.getIdade() + " anos de idade");

        //nova instancia de Gato-Animal, com metodos e atributos de Gato
        //mesmo tendo sido instanciado de Animal 
        //em tempo de execução usa os metodos do objeto a direita, comporta-se como um Gato
        Animal bichoLoko = new Gato();
        System.out.println(bichoLoko.emitirSom());

        //linha abaixo não funciona porque bichoLoko foi declarado como Animal
        // bichoLoko.cuspirBolaDePelo();
        
        //novas instancias de Cachorro
        // declaração a esquerda; instanciação a direita
        //em tempo de execução ambos vão se comportar como a instancia Cachorro
        Animal cachorro1 = new Cachorro();
        Cachorro cachorro2 = new Cachorro();
        
        // o metodo comer não pode ser chamado dentro de outro metodo pois é VOID
        //System.out.println("cachorro 1 " + cachorro1.comer("carne"));
        
        cachorro1.comer("carne");
        System.out.println("cachorro 1 " + cachorro1.emitirSom());
        
        cachorro2.comer("arroz");
        System.out.println("cachorro 2 " + cachorro2.emitirSom());
        
    }
    
}
