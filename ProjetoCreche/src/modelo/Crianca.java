package modelo;

public class Crianca {

    private String nome;
    private int idade;
    private String sexo;

    // construtor gerado com alt+insert
    public Crianca(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {

        if (idade >= 0) {
            this.idade = idade;
        }

    }

    /**
     * @return the sexo
     */
    public String getSexo() {

       
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        
         if (sexo.equals("M") || sexo.equals("F")) {
            this.sexo = sexo;
        }
        
    }

}
