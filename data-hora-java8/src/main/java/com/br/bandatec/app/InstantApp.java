package com.br.bandatec.app;
 
//Powered by Henrique Treza

import java.time.Duration;
import java.time.Instant;
import java.time.ZoneId;

public class InstantApp {
    public static void main(String[] args) {
        /*
        Quando queremos manipular "Instantes", usamos Instant(Normalmente operações
        compuatacionais
        Recuperando um instante atual(o "Agora")
        */
        
        //Recuperando o valor do instante em outras timeZones
        //(outros fuso horários.
        Instant agora = Instant.now();
        System.out.println(agora);
        System.out.println(agora.atZone(ZoneId.of("Japan")));
        System.out.println(agora.atZone(ZoneId.of("America/Sao_Paulo")));
        
        Instant agoraFinal = Instant.now();
        
        //para calcular a diferença de tempo entre Instant,
        //usamos o Duration
        Duration duracao = Duration.between(agora, agoraFinal);
        System.out.println("Quantos milisegundos? "+duracao.toMillis());
        
    }
    
}
