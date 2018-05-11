package br.com.bandtec.modelo;

//Powered by Henrique Treza
public interface Boletim {
    //Interface não é possivel ter método privado.

//Interface são como classes 100% abstratas, ou seja, não é posssível
    //ter método concretos(com corpo)
    //NÃO É POSSÍVEL TER ATRIBUTOS DE INSTANCIA
//double somar(double n1, double n2); método simpleas para somar!!
    //Todo método em uma interface é, por padrão:
// Abstrato e Público
    // Não é possível definir construtores numa interface
    boolean isAprovado();

}
