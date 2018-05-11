
package br.com.bandtec.projetomaven1;


public class Cartel {
    
    private int vitorias;
    private int derrotas;
    private int empates;

    //construtor
    public Cartel(int vitorias, int derrotas, int empates) {
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
    
    
    
      
    
}
