package br.com.bandtec.modelo;

//Powered by Henrique Treza
public class Aluno {

    private int matricula;
    private String nome;
    
    
    //Isso é usado quando você quer comparar duas classes no sistema, usa-se equals e hashcode.
    // Criado com ALT + INSERT

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + this.matricula;
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
    
    
    

    public Aluno(int matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
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
