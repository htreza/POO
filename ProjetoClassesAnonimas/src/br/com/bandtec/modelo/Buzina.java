

package br.com.bandtec.modelo;


//classes abstratas e Interfaces não podem ser estanciadas diretamente
//É preciso criar uma subclasse concreta para usar seus métodos
public abstract class Buzina {
    
    //metdos abstrados somente podem ser criados em classes abstratas
    //somente com assinatura (sem parametros)
    public abstract String buzinar();
    
}
