

package br.com.bandtec.projetobigdecimal.app;

import java.math.BigDecimal;
import java.math.RoundingMode;



public class AppBigDecimal {
    
    public static void main(String[] args) {
        
        // o resultado desse calculo deveria ser 0.01, mas o tipo de variavel double mostra um numero quebrado
        double a = 0.02;
        double b = 0.03;
        double c = b-a;
        System.out.println(c);
        
        // Objetos do tipo BigDecimal não são numeros, tem metodos que devem ser invocados
        // Classe usada para valores financeiros, preços, juros etc
        BigDecimal n1 = new BigDecimal("0.02");
        BigDecimal n2 = new BigDecimal("0.03");
        BigDecimal n3 = n2.subtract(n1);
        System.out.println(n3);
        
        //maneiras de criar um BigDecimal
        BigDecimal n4 = BigDecimal.valueOf(1.879); // double
        BigDecimal n5 = BigDecimal.valueOf(77); // int
        BigDecimal n6 = BigDecimal.valueOf(777139, 2); //long determinando qtas casas decimais (scale)
        BigDecimal n7 = BigDecimal.valueOf(12345L); // long
        
        //conversões
        System.out.println(n1.intValue());//somente a parte inteira do valor
        System.out.println(n3.doubleValue()); // converte em double, com o formato de BigDecimal
        System.out.println(n7.longValue()); // parte inteira do long
        
        
        
        //operacoes com BigDecimal
        System.out.println(n1.add(n2)); //soma
        System.out.println(n2.divide(n1)); // divisão
        System.out.println(n1.multiply(n2)); // multiplicação
        System.out.println(n2.pow(2));// potencição ( potencia 2)
        
        System.out.println(n1.abs()); //valor absoluto: o valor positivo do número
        System.out.println(n1.negate()); // negação do numero: inverte o sinal
        System.out.println(n1.negate().negate());// inversão da inversão do sinal
        System.out.println(n1.max(n2)); // compara os valores e retorna o de maior valor
        System.out.println(n2.max(n1)); // compara os valores e retorna o de maior valor
        
        //arredondamentos
        
        BigDecimal valor1 = new BigDecimal("4.01");
        BigDecimal valor2 = new BigDecimal("4.41");
        BigDecimal valor3 = new BigDecimal("4.50");
        BigDecimal valor4 = new BigDecimal("4.51");
        BigDecimal valor5 = new BigDecimal("4.99");
        
        System.out.println("Valor 4.01 arredondado : " + valor1.setScale(0, RoundingMode.HALF_UP));
        System.out.println("Valor 4.01 arredondado : " + valor1.setScale(0, RoundingMode.UP));
        System.out.println("Valor 4.01 arredondado : " + valor1.setScale(0, RoundingMode.CEILING));
        System.out.println("Valor 4.01 arredondado : " + valor1.setScale(0, RoundingMode.FLOOR));
        System.out.println("Valor 4.01 arredondado : " + valor1.setScale(0, RoundingMode.HALF_DOWN));
        System.out.println("Valor 4.01 arredondado : " + valor1.setScale(0, RoundingMode.DOWN));
        
        //mostra erro se o valor entrado tiver numero quebrado
        //System.out.println("Valor 4.01 arredondado : " + valor1.setScale(0, RoundingMode.UNNECESSARY));
        
        //"politicas" de arredondamento
        System.out.println("Valor 4.50 arredondado : " + valor3.setScale(0, RoundingMode.HALF_UP));
        System.out.println("Valor 4.50 arredondado : " + valor3.setScale(0, RoundingMode.UP));
        System.out.println("Valor 4.50 arredondado : " + valor3.setScale(0, RoundingMode.CEILING));
        System.out.println("Valor 4.50 arredondado : " + valor3.setScale(0, RoundingMode.FLOOR));
        System.out.println("Valor 4.50 arredondado : " + valor3.setScale(0, RoundingMode.HALF_DOWN));
        System.out.println("Valor 4.50 arredondado : " + valor3.setScale(0, RoundingMode.DOWN));
        
        System.out.println("Valor 4.01 arredondado : " + valor1.setScale(0, RoundingMode.UP));
        System.out.println("Valor 4.99 arredondado : " + valor5.setScale(0, RoundingMode.DOWN));
        
        // vai dar erro se não explicitar a politica de arredondamento
        //System.out.println(valor3.setScale(0));
        
    }
    
    
}
