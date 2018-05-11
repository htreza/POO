package app;

import modelo.GrupoPorquinhos;
import modelo.PorquinhoPapai;
import modelo.PorquinhoPersonalizado;
import modelo.PorquinhoVovo;

public class AppPorquinhos {

    public static void main(String[] args) {

        PorquinhoVovo porquinho1 = new PorquinhoVovo();
        PorquinhoVovo porquinho2 = new PorquinhoVovo();
        PorquinhoVovo porquinho3 = new PorquinhoVovo();

        PorquinhoPapai porquinho4 = new PorquinhoPapai();

        //recuperando valores com os metodos get
        System.out.println("Valor do porquinho 4 é:" + porquinho4.getValor());
        System.out.println("Dono do porquinho 4 é: " + porquinho4.getDono());

        //alterando os valores com os metodos set
        porquinho4.setValor(40);
        porquinho4.setDono("Muleke piranha");

        System.out.println("Valor do porquinho 4 é:" + porquinho4.getValor());
        System.out.println("Dono do porquinho 4 é: " + porquinho4.getDono());

        //novo objeto de porquinhopersonalizado, criado com construtor de 2 paramentros
        PorquinhoPersonalizado porquinho5 = new PorquinhoPersonalizado(35, "Filha");
        PorquinhoPersonalizado porquinho6 = new PorquinhoPersonalizado(100, "riquinho");
        PorquinhoPersonalizado porquinho7 = new PorquinhoPersonalizado(1, "bastardo");

        System.out.println("porquinho 5: " + porquinho5.getValor());
        System.out.println("porquinho 5: " + porquinho5.getDono());
        System.out.println("porquinho 6: " + porquinho6.getValor());
        System.out.println("porquinho 6: " + porquinho6.getDono());
        System.out.println("porquinho 7: " + porquinho7.getValor());
        System.out.println("porquinho 7: " + porquinho7.getDono());

        //instanciando um obj grupoporquinhos, sets dos porquinhosPersonalizados
        // só é possivel usar os porquinhos 5, 6 ou 7, pq eles são do tipo porquinhosPersonalizados
        GrupoPorquinhos grupoPorquinhos1 = new GrupoPorquinhos();
        grupoPorquinhos1.setPorquinho1(porquinho5);
        grupoPorquinhos1.setPorquinho2(porquinho6);

        //soma dos 2 porquinhos do grupoPorquinhos1
        double somaPorquinhos = grupoPorquinhos1.getPorquinho1().getValor()
                + grupoPorquinhos1.getPorquinho2().getValor();

        System.out.println("Soma de porquinhos " + somaPorquinhos);

        System.out.println("soma de porquinhos " + grupoPorquinhos1.getSomaPorquinhos());

    }

}
