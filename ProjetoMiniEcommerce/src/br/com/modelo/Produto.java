package br.com.modelo;

import br.com.excecoes.NomeInvalidoException;
import br.com.excecoes.PrecoInvalidoException;

public class Produto {

    private String nome;
    private double precoUnitario;

    //construtor com todos os throws necessárias
    public Produto(String nome, double precoUnitario) throws NomeInvalidoException, PrecoInvalidoException {

        if (nome == null || nome.length() < 3) {
            throw new NomeInvalidoException();
        }

        this.nome = nome;

        if (precoUnitario <= 0) {

            throw new PrecoInvalidoException();
        }
        this.precoUnitario = precoUnitario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

}
