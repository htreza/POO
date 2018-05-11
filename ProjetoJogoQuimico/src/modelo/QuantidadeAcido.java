package modelo;

//Powered by Henrique Treza
import java.util.Random;

public class QuantidadeAcido {

    private int quantAcidoAtual;

    Random random1 = new Random();

    public void quantAcido() {
        this.quantAcidoAtual = random1.nextInt(50);
    }

    public int getQuantAcidoAtual() {
        return quantAcidoAtual;
    }

}
