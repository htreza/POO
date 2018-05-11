package com.br.bandatec.app;
 
//Powered by Henrique Treza

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class LocalDateTimeApp {
    public static void main(String[] args) {
        //para lidar com datas que precisam da hora, min e segundos usamos LocalDateTime
        
        LocalDateTime agora = LocalDateTime.now();
        System.out.println(agora);
        
        LocalDateTime nascimento = LocalDateTime.of(1988, Month.MARCH, 7, 12, 30);
        //ano, mês, dia, hora(24), minuto
        //é possível informar depois os segundos ou ainda, depois dos segundos, os milisegundos
        System.out.println(nascimento);
        
         long horasDevida = ChronoUnit.HOURS.between(nascimento, agora);
        System.out.println("Horas de vida: " + horasDevida);
        
        
        
    }
}
