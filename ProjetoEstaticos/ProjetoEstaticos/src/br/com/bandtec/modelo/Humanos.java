package br.com.bandtec.modelo;

//Powered by Henrique Treza
public class Humanos {
    //Atributo de instancia "idade" muda somente para cada atributo

    private int idade;

    //Idade maxima provada pela ciência
    // Criando construtor que recebe idade ALT+ INSERT = Construtor.
    public Humanos(int idade) {
        this.idade = idade;
    }
    // Estatico já muda para todos os humanos o valor.
    //oNDE TEM UMA CLASSE STATIC USA-SE O CAPS LOCKS, TUDO EM LETRA MAIUSCULA(Separado por _)
    // POR CONVENÇÃO.
    //Atributos Static, são chamados de atributos de classe, muda valor para todos
   public static int IDADE_MAXIMA_RACA_HUMANA = 120;

    public int getAnosMaximoVida() {
        return IDADE_MAXIMA_RACA_HUMANA - this.idade;
    }
}
