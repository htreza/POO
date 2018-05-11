

package modelo;



public class Lanche {
    
    private String tipo;
    private Biscoito biscoitoLanche;
    
    
    // construtores, sempre logo após os atributos
    public Lanche(String tipo, Biscoito biscoitoLanche) {
        this.tipo = tipo;
        this.biscoitoLanche = biscoitoLanche;
    }

    public Lanche(Biscoito biscoitoLanche) {
        this.biscoitoLanche = biscoitoLanche;
    }
    
    
    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the biscoitoLanche
     */
    public Biscoito getBiscoitoLanche() {
        return biscoitoLanche;
    }

    /**
     * @param biscoitoLanche the biscoitoLanche to set
     */
    public void setBiscoitoLanche(Biscoito biscoitoLanche) {
        this.biscoitoLanche = biscoitoLanche;
    }
    
    
    
    
    
}
