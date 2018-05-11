

package modelo;



public class GrupoPorquinhos {
    
    private PorquinhoPersonalizado porquinho1;
    private PorquinhoPersonalizado porquinho2;
    
    

    /**
     * @return the porquinho1
     */
    public PorquinhoPersonalizado getPorquinho1() {
        return porquinho1;
    }

    /**
     * @param porquinho1 the porquinho1 to set
     */
    public void setPorquinho1(PorquinhoPersonalizado porquinho1) {
        this.porquinho1 = porquinho1;
    }

    /**
     * @return the porquinho2
     */
    public PorquinhoPersonalizado getPorquinho2() {
        return porquinho2;
    }

    /**
     * @param porquinho2 the porquinho2 to set
     */
    public void setPorquinho2(PorquinhoPersonalizado porquinho2) {
        this.porquinho2 = porquinho2;
    }
    
    //set de soma para evitar erro de nullpoint, caso um dos porquinhos não tenha sido chamado
    public double getSomaPorquinhos(){
        
        double somaPorquinhos = 0;
        
        if (this.porquinho1 != null){
            //não precisa de this.somaPorquinhos pois 
            somaPorquinhos =+ this.porquinho1.getValor();
        }
        
        if (this.porquinho2 != null){
            somaPorquinhos =+ this.porquinho2.getValor();
        }
        
        return somaPorquinhos;
    }
    
}
