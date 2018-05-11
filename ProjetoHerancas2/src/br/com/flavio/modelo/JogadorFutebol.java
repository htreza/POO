

package br.com.flavio.modelo;


//classe abstrata, pode ser possuir metodos abstratos
// não é possivel criar objetos de classes abstratas
//não é possivel instanciar uma classe abstrata
public abstract class JogadorFutebol {
    
  //metodo abstrato, não tem corpo
  // esse metodo só vai ser efetivado em uma classe concreta
  // ele DEVE ter uma implementação nas classes concretas
    public abstract void chutar();
  
  //metodo concreto em classe abstrata
  // não tem implementação obrigatoria nas classes concretas 
  public void aquecer(){
      System.out.println("jogador fazendo aquecimento");
  }
    
}
