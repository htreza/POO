
package br.com.bandtec.modelo;


public class Pessoa {
    
    private String nome;
    private int idade;

    //construtor
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    //toString criado com alt + insert
    // dá um "nome" legivel ao objeto Pessoa, mostrando os atributos 
    // se alterar os atributos é preciso gerar o toString
    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + '}';
    }
    
    
    
}
