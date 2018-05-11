package modelo;

//Powered by Henrique Treza
public class Mensagens {

    public void apresentarJogo() {
        System.out.println("O composto químico fictício 'Ácido Kryptocianico' pode apenas ser díluido pela \n"
                + "proporção de 7 partes de água para 3 partes de ácido. Se qualquer outra proporção for utilizada,\n"
                + " o ácido fica instável e logo explode. Dada certa quantidade de ácido, você deve decidir a quantidade\n"
                + " de água a ser adicionada para dissolução. Se você errar, deverá encarar as consequências!!!");
    }

    public void quantidadeAcido(int acido) {
        System.out.println(acido + " litros de Ácido Kryptocianico. Quantos litros de água? ");
    }

    public void resultado(boolean resultado) {
        if (resultado) {
            System.out.println("Bom Trabalho!!! Você pode respirar tranquilo, mas não respire os gases.");
        } else {
            System.out.println("Você foi desintegrado em uma poça de de protoplasma! ");
            System.out.println("Você ainda tem vidas restantes, tente novamente!");
        }

    }

    public void morreu() {
        System.out.println("Suas nove vidas foram utilizadas, mas você será lembrado pelas suas \n"
                + "contribuições no campo de química de quadrinhos");
    }

}
