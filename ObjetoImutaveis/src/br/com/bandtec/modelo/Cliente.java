package br.com.bandtec.modelo;

//Powered by Henrique Treza
public class Cliente {

    private final Integer codigo;
    private final String cpf;
    private String nome;

    //O "Final" antes do tipo torna o objeto IMUTÁVEL
    //Ou seja , uma vez definido o valor, não pode ser alterado.
    //Quando criar um objeto "IMUTAVEL" sempre inserir um valor.
    public Cliente(Integer codigo, String cpf) {
        this.codigo = codigo;
        this.cpf = cpf;
    }

    public void fake(){
        //this.cpf = "0998878"
               
    }
    
    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
//Nem mesmo a própria classe
//Pode açterar seus atributos IMUTAVEIS
//this.codigo = codigo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
 
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
    public void setNome(final String nome) {
      
        //Argumentos ou parametros de metodos
        //Também podem ser imutaveis
        //Nesse caso, a linha abaixo não iria compilar.
           //nome = "Sr(a)" +nome.toUpperCase();
        this.nome = nome;
    }
    
    

}
