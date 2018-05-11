// em java o pacote deve estar explicito
package app;

import modelo.Corredor;


public class App {
    
    public static void main(String[] args) {
        
        // meuCorredor1 e meuCorredorB são um Objetos do tipo Corredor
        
        Corredor meuCorredor1 = new Corredor();
        
        Corredor meuCorredorB = new Corredor();
        
        //invocando os comportamentos dos objetos
        
        meuCorredor1.alongar();
        meuCorredor1.correr();
        
        meuCorredorB.alongar();
        meuCorredorB.correr();
        
        meuCorredor1.fazerRegimeDeEngorda();
        meuCorredor1.fazerRegimeDeEngorda();
        meuCorredor1.fazerRegimeDeEngorda();
        meuCorredor1.fazerRegimeDeEngorda();
        meuCorredor1.fazerRegimeDeEngorda();
        meuCorredor1.fazerRegimeParaEmagrecer();
        meuCorredor1.fazerRegimeParaEmagrecer();
        
        meuCorredorB.fazerRegimeDeEngorda();
        meuCorredorB.fazerRegimeParaEmagrecer();
        meuCorredorB.fazerRegimeParaEmagrecer();
        meuCorredorB.fazerRegimeParaEmagrecer();
        
    }
    
}
