
package br.com.bandtec.app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class AppMapasListas {
    
    public static void main(String[] args) {
        
        //lista que só recebe Mapas
        List<Map<String,Object>> listaMapas = new ArrayList<>();
        
        Map<String, Object>mapa1 = new HashMap<>();
        mapa1.put("peso",90);
        mapa1.put("altura",1.65);
        
        Map<String, Object>mapa2 = new HashMap<>();
        mapa2.put("pais","Brasil");
        mapa2.put("estado","SP");
        
        //adcionando os mapas na lista
        listaMapas.add(mapa1);
        listaMapas.add(mapa2);
        
        System.out.println("elemntos da listaMapas "+listaMapas);
        System.out.println("quantidade da listaMapas "+listaMapas.size());
        
        //removendo uma chave do Mapa, que vai refletir na lista
        mapa1.remove("altura");
        System.out.println(listaMapas);
        
    }
    
}
