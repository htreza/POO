package app;

//Powered by Henrique Treza
import java.util.Scanner;
import modelo.Mensagens;
import modelo.QuantidadeAcido;
import modelo.QuantidadeVidas;
import modelo.VerificacaoProporcao;

public class AppJogoQuimico {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Mensagens print = new Mensagens();
        QuantidadeVidas vidasRestantes = new QuantidadeVidas();
        QuantidadeAcido kryptocianico = new QuantidadeAcido();
        VerificacaoProporcao check = new VerificacaoProporcao();

        print.apresentarJogo();

        while (vidasRestantes.getVida() > 0) {

            kryptocianico.quantAcido();
            print.quantidadeAcido(kryptocianico.getQuantAcidoAtual());
            double resposta = leitor.nextDouble();
            vidasRestantes.verificarVida(check.kaboom(resposta, kryptocianico.getQuantAcidoAtual()));

        }

    }
}
