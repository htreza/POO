package br.com.bandtec.modelos;

//Powered by Henrique Treza
public abstract class MaquinaCafe {

    private int porcoes;

    public MaquinaCafe(int porcoes) {
        this.porcoes = porcoes;

    }

    public int getPorcoes() {
        return porcoes;
    }

    public abstract boolean validarCredito(double credito);

    protected abstract String getMensagem();

    public String produzirExpresso(double credito) {

        if (porcoes == 0) {
            System.out.println("Não há mais café na máquina");
        }
        if (validarCredito(credito) == true) {
            return getMensagem();

        }
       
            
        }
    }

}
