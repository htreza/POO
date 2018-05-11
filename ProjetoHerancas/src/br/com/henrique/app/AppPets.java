package br.com.henrique.app;

import br.com.henrique.modelo.Animal;
import br.com.henrique.modelo.Cachorro;
import br.com.henrique.modelo.Gato;
import java.util.Scanner;

public class AppPets {

    
    public static void main(String[] args) {
        
        // objeto pet pode ser Cachorro ou Gato
        // um dos tipos polimorfismo, que vai ocorrer em tempo de execução
        Animal pet = null;

        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual PET você vai criar? 1 - Cachorro; 2 - Gato");
        String tipo = leitor.nextLine();

        //instanciando o tipo de pet em tempo de execução
        switch (tipo) {
            case "1":
                pet = new Cachorro();
                break;

            case "2":
                pet = new Gato();
                break;

        }
        if (pet == null) {
            System.out.println("Nennhum pet!");
            System.exit(0);
        }

        pet.comer("ração Hills");
        System.out.println(pet.emitirSom());
       
    }

}
