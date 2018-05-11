package br.com.bandtec.modelo;

public class Humano {

    private int idade;

    //atributos Estaticos , forçam qualquer alteração ser feita em todoso os objetos instanciados
    // ajuda a economizar memória e processamento
    // atribuitos 'static' são de Classe, não de Instancia
    // por convenção o nome do atributo deve estar todo em maiusculo
    // na maioria das vezes é público
    public static int IDADE_MAXIMA_HUMANOS = 120;

    //construtor 'padrão' criado
    public Humano(int idade) {
        this.idade = idade;
    }

    public int getAnosMaximosVida() {

        // não precisa do this.IDADE... pois não é atributo de instancia
        return IDADE_MAXIMA_HUMANOS - this.idade;

    }

}
