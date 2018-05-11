
package br.com.bandtec.modelo;


public class Cliente {
    
    //toda variavel final (imutavel) deve ter valor já declarado ou
    // Criar um construtor com  variaveis
    // não é possivel criar setters 
    //definido o valor, não pode ser alterado
    //objetos final são liberados mais rapido da memória e garantem mais segurança no codigo
    //classe anonimas são muito comuns em Android e jogos
    // Também é comum classes estaticas serem tb final
    private final Integer codigo;
    // CPF tem que ser String, até porque os Zeros a esquerda tb contam
    //conta de banco e CEP também são Strings
    private final String cpf;
    private String nome;

    //construtor, atribuindo um valor aos atributos Final
    public Cliente(Integer codigo, String cpf) {
        this.codigo = codigo;
        this.cpf = cpf;
    }

    public void fake(){
        // nem mesmo a propria classe pode alterar seus atributos imutaveis (final)
        //this.cpf = "00";
    }
    
    public String getNome() {
        return nome;
    }

    //paramentros de metodos (argumentos) imutaveis
    public void setNome(final String nome) {
        //não é possivel colocar valor no argumento a partir desse ponto
        // erro de compilação
        //nome = nome.toUpperCase();
        this.nome = nome;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getCpf() {
        return cpf;
    }
    
    
    
}
