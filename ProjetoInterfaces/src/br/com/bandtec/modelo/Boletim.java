

package br.com.bandtec.modelo;


// interface --> classe 100% abstrata
// metodos somente com assinatura, sem corpo
public interface Boletim {
    
    //não é possivel criasr atributos em uma classe
    // private double nota1;
    // private double nota2;
    
    //somente com assinatura, sem corpo
    // metodos publicos sempre
   //double somar (double n1, double n2);
    
    // não é possive definir um construtor em uma Interface
    
    //todo metodo em uma interface é abstrato e público, por padrão
    boolean isAprovado();
    
    
}
