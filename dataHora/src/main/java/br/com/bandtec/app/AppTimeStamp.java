
package br.com.bandtec.app;

import java.util.Date;


public class AppTimeStamp {
    
    public static void main(String[] args) {
        
        //recuperando o TimeStamp == tempo em milissegundos
        // data 0 em 00:00:00 01/01/1970
        // todo calculo e banco de dados em informática, em relação a datas é guardado em TimeStamp
        System.out.println(new Date().getTime());
        
        Date dataloka = new Date(0L);
        Date dataloka1 = new Date(8568300099999999994L);
        Date dataloka2 = new Date(-438903897786744L);
        
        System.out.println(dataloka);
        System.out.println(dataloka1);
        System.out.println(dataloka2);
        
    }
    
}
