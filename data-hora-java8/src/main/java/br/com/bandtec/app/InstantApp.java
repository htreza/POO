package br.com.bandtec.app;

import java.time.Duration;
import java.time.Instant;
import java.time.ZoneId;

public class InstantApp {

    public static void main(String[] args) {

        //Instant - normalmente usado em operações computacionais
        Instant agora = Instant.now();
        //recuparando o instante atual
        System.out.println(agora); // resultado ==> 2017-10-17T21:23:14.894Z
        
        //recuperando o instante em fusos horários especificos
        System.out.println(agora.atZone(ZoneId.of("Japan"))); // resultado ==> 2017-10-18T06:27:11.378+09:00[Japan]
        System.out.println(agora.atZone(ZoneId.of("America/Sao_Paulo"))); // resultado ==> 2017-10-17T19:29:05.454-02:00[America/Sao_Paulo]

        
        Instant agoraFinal = Instant.now();
        
        //calcular a diferença de tempo entre o Instant, tempo de execução do comando
        Duration duracao = Duration.between(agora, agoraFinal);
        System.out.println("Quantos milissegundos? " + duracao.toMillis());
        
        
    }

}
