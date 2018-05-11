package br.com.henrique.modelo;

public class Cachorro extends Animal {

    //construttor padrão sem parametros
    public Cachorro() {

    }

    @Override
    protected void nascer() {
        System.out.println("O cachorro nasceu");
    }

    @Override
    public String emitirSom() {
        return "Só as cachorras...AUAU AUAU";
    }

    @Override
    public void comer(String alimento) {
        System.out.println("Cachorro comendo " + alimento);
    }

}
