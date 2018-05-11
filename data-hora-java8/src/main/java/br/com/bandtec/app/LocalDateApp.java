package br.com.bandtec.app;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class LocalDateApp {

    public static void main(String[] args) {

        // Datas sem a hora, minuto e segundo
        // LocalDate só trabalha com dia, mês e ano
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);

        //recuperando a data de maneira formatada, segundo uma forma ISO especifica
        System.out.println(hoje.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        System.out.println(hoje.format(DateTimeFormatter.ofPattern("MMMM")));

        System.out.println(hoje.getMonth());
        System.out.println(hoje.getMonthValue());

        //recuperando o mês em portugues, mas é pouco usado
        System.out.println(hoje.getMonth().getDisplayName(TextStyle.FULL, Locale.forLanguageTag("pt")));

        LocalDate nascimento = LocalDate.of(1990, 10, 6);
        System.out.println("nascimento: " + nascimento);

        //criando uma data a partir de uma String
        LocalDate dataLoka = LocalDate.parse("10/08/2010", DateTimeFormatter.ofPattern("dd/MM/yyy"));
        System.out.println("dataLoka: "+dataLoka);

        //Calculando a diferença de tempo
        Period periodo = Period.between(nascimento, hoje);
        System.out.println("Quantos anos de vida? " + periodo.getYears());
        System.out.println("Quandos meses de vida? " + periodo.getMonths());
        System.out.println("Quandos meses de vida? " + periodo.getDays());
        System.out.println("Idade completa: " + periodo.getYears() + " anos"
                + periodo.getMonths() + " ,meses" + periodo.getDays() + " e dias");

        //calculando diferenças especificas de tempo
        //não funciona com hora, minuto e segundo. Para esses usar o LocalDateTime
        long diasDeVida = ChronoUnit.DAYS.between(nascimento, hoje);
        System.out.println("Dias de vida: " + diasDeVida);

        long mesesDeVida = ChronoUnit.MONTHS.between(nascimento, hoje);
        System.out.println("Meses de vida: " + mesesDeVida);

        //Adcionando ou retirando tempo de uma data
        System.out.println(dataLoka);

        //adcionando 2 dias
        LocalDate dataLoka2 = dataLoka.plusDays(2);
        System.out.println(dataLoka2);

        //tirando 3 meses
        LocalDate dataLoka3 = dataLoka.minusMonths(3);
        System.out.println(dataLoka3);

    }

}
