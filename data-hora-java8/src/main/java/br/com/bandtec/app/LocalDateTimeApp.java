
package br.com.bandtec.app;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;



public class LocalDateTimeApp {
    
    public static void main(String[] args) {
        
         //para lidar com datas que precisam de hora, minuto e segundos
         // tem todos os métodos do LocalDate
    
    LocalDateTime agora = LocalDateTime.now();
        System.out.println("LocalDateTime: "+agora);
        
        LocalDateTime nascimento = LocalDateTime.of(1990, 10, 8, 11, 15, 28);
        System.out.println("Nascimento com precisão: "+nascimento);
        
        long horasVida = ChronoUnit.HOURS.between(nascimento, agora);
        System.out.println("Horas de vida: "+horasVida);
        
    }
    
   
    
}
