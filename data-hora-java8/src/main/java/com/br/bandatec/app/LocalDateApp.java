package com.br.bandatec.app;

//Powered by Henrique Treza
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class LocalDateApp {

    public static void main(String[] args) {
        /*
        Para lidar com Datas SEM a hora, min e seg usamos a LocalDate
        
        LocalDate de "hoje"
         */
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);

        System.out.println(hoje.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        System.out.println(hoje.format(DateTimeFormatter.ofPattern("yyyy")));

        System.out.println(hoje.getMonth());

        System.out.println(hoje.getMonth().getDisplayName(TextStyle.FULL, Locale.forLanguageTag("pt")));

        LocalDate nascimento = LocalDate.of(1988, Month.MARCH, 7);
        System.out.println("Nascimento: " + nascimento);

        //Criando uma data a partir de uma String
        LocalDate dataLoka = LocalDate.parse("01/01/1830", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println(dataLoka);
        //Calculando a diferença de tempo usamos o Period

        Period periodo = Period.between(nascimento, hoje);
        System.out.println("Idade completa " + periodo.getYears() + " Anos "
                + periodo.getMonths() + " Meses " + periodo.getDays() + " Dias");

        //Para calculos de diferenças específicas usamos o ChronoUnit.XXX.between
        long diasDevida = ChronoUnit.DAYS.between(nascimento, hoje);
        System.out.println("Dias de vida: " + diasDevida);

        long mesesDevida = ChronoUnit.MONTHS.between(nascimento, hoje);
        System.out.println("Meses de vida: " + mesesDevida);

        long anosDevida = ChronoUnit.YEARS.between(nascimento, hoje);
        System.out.println("Anos de vida: " + anosDevida);

        //Adicionando usa-se plus tempo de uma Data
        System.out.println(dataLoka);
        LocalDate dataLoka2 = dataLoka.plusDays(2);
        System.out.println(dataLoka2);

        //Retirando usa-se minus
        LocalDate dataLoka3 = dataLoka.minusMonths(3);
        System.out.println(dataLoka3);
    }

}
