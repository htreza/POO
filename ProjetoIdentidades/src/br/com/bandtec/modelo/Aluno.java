package br.com.bandtec.modelo;

public class Aluno {

    private int matricula;
    private String nome;

    //metodo criado com alt + insert
    //usado caso seja necessario comparar objetos ao longo do sistema
    // a classe String herda esses metodos por padrão
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + this.matricula;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Aluno other = (Aluno) obj;
        if (this.matricula != other.matricula) {
            return false;
        }
        return true;
    }
    
    

    //construtor "padrão"
    public Aluno(int matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    public Aluno() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
