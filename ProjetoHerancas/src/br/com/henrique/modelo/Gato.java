

package br.com.henrique.modelo;

//Gato é um tipo de animal, portanto ESTENDE as caracteristicas (metodos e atributos) de Animal
public class Gato extends Animal{
    
    //construtor padrão 
    public Gato(){
        
    }

    protected void nascer(){
        System.out.println("Gato nasceu...");
    }
    
    @Override
    // metodo emitirSom com sobrescrita ao metodo do classe mâe
    public String emitirSom() {
        return "miou"; 
    }
    
    public void cuspirBolaDePelo(){
        System.out.println("Gato cuspindo bolinho de pêlo");
    }
    
    
}
