package modelo;

import java.util.ArrayList;
import java.util.List;

public class Creche {

    private String nomeCreche;
    private List<Crianca> criancas = new ArrayList<>();

    public void addCrianca() {

    }

    /**
     * @return the nomeCreche
     */
    public String getNomeCreche() {
        return nomeCreche;
    }

    /**
     * @param nomeCreche the nomeCreche to set
     */
    public void setNomeCreche(String nomeCreche) {
        this.nomeCreche = nomeCreche;
    }

    /**
     * @return the criancas
     */
    public List<Crianca> getCriancas() {
        return criancas;
    }

}
