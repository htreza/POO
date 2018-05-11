package modelo;

//Powered by Henrique Treza
public class VerificacaoProporcao {

    public boolean kaboom(double agua, int acido) {
        double quantAguaCorreta = (acido / 3) * 7;
        double limiteSuperior = quantAguaCorreta * 1.05;
        double limiteInferior = quantAguaCorreta * 0.95;
        if (agua >= limiteInferior && agua <= limiteSuperior) {
            return true;
        }
        return false;
    }

}
