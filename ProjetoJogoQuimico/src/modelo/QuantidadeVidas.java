package modelo;

//Powered by Henrique Treza
public class QuantidadeVidas {

    private int vida = 9;
    Mensagens print = new Mensagens();

    public void verificarVida(boolean resultado) {
        if (resultado) {
            print.resultado(resultado);
            this.vida = 0;
        } else {
            this.vida -= 1;
            if (this.getVida() > 0) {
                print.resultado(resultado);
            } else {
                print.morreu();
                this.vida = 0;
            }
        }
    }

    public int getVida() {
        return vida;
    }

}
