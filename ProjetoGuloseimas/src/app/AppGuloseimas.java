package app;

import modelo.Biscoito;
import modelo.Lanche;

public class AppGuloseimas {

    public static void main(String[] args) {

        //usando sobrescrita de 2 construtores
        Biscoito biscoito1 = new Biscoito("Chocolate", 3, 20, 5);
        Biscoito biscoito2 = new Biscoito(25);

        System.out.println("Biscoito 1 tem sabor de " + biscoito1.getSabor()
                + ", peso de " + biscoito1.getPeso() + " gramas, calorias " + biscoito1.getCaloriasPorUnidade()
                + " Cal. e custa R$ " + biscoito1.getPreco());

        //usando o segundo construtor,que tem um só parametro, aparecem os valores padrão null e 0
        System.out.println("Biscoito 2 tem sabor de " + biscoito2.getSabor()
                + ", peso de " + biscoito2.getPeso() + " gramas, calorias " + biscoito2.getCaloriasPorUnidade()
                + " Cal. e custa R$ " + biscoito2.getPreco());

        Lanche lanche1 = new Lanche("Traquinas", biscoito1);
        Lanche lanche2 = new Lanche(biscoito2);

        System.out.println("tipo do lanche 2 "+lanche2.getTipo());

        System.out.println("lanche 1 "+lanche1.getBiscoitoLanche().getCaloriasPorUnidade()
                + lanche1.getBiscoitoLanche().getPeso()
                + lanche1.getBiscoitoLanche().getPreco()
                + lanche1.getBiscoitoLanche().getSabor());

    }

}
