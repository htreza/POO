

package modelo;

public class Boletim {
    
    //atributos
    private double nota1;
    
    private double nota2;
    
    private double media;
    
    private String resultado;
    
    //metodos
    
    public void alterarNota1(double novaNota){
        
        this.nota1 = novaNota;
        atualizarMedia();
    }
    
    public void alterarNota2(double novaNota){
       
        this.nota2 = novaNota;
        atualizarMedia();
    }
    
    // private pq só vai utilizar dentro dessa classe
    private void atualizarMedia(){
        
        this.media = (this.nota1 + this.nota2)/2;
        this.resultado = media >= 5 ? "aprovado" : "reprovado";
    }
 
    public double mediaFinal(){
        return this.media;
    }
    
    public String resultadoFinal(){
        return this.resultado;
    }
    
    
}
