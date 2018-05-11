
package modelo;


public class Corredor {
    
    //atributo de instancia
    // private = não pode ser mudado externamente
    // atributos tendem a ser privados
    private double peso = 70;
    
    //metodo correr, publico - todos sabem que existe e podem pedir para correr(invocar)
    // publico -  podem pedir para correr(invocar)
    //metodo = comportamento
    // void --> não devolve/retorna nada. Inicia com minuscula, verbos no infinitivo
   
        
    public void correr(){
        
        System.out.println("Corredor correndo");
        
    }
    
    public void alongar(){
        
        System.out.println("Corredor alongado");
    }
    
    //metodo que faz aumentar o peso em 10%
    public void fazerRegimeDeEngorda(){
        
        //this para mostrar que se refere a um atributo de instancia
        this.peso = this.peso * 1.1;
        
    }
            
    public void fazerRegimeParaEmagrecer(){
        
        this.peso = this.peso * 0.95;
        
    }
    
}
