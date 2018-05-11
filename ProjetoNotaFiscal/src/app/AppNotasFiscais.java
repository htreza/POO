
package app;

import modelo.Item;
import modelo.NotaFiscal;



public class AppNotasFiscais {
    
    public static void main(String[] args) {
        
        NotaFiscal nota1 = new NotaFiscal();
        
        //parametros dos objetos criados a partir do constutor da classe Item
        Item item1 = new Item("feijão", 3,5.5);
        Item item2 = new Item("arroz", 10,11);
        Item item3 = new Item("ovo", 3,2.5);
        
        
        nota1.adcicionarItem(item1);
        nota1.adcicionarItem(item2);
        nota1.adcicionarItem(item3);
        
        System.out.println("Valor total do item 1: "+item1.getValorTotal());
        
        System.out.println("Valor total do item 2: "+item2.getValorTotal());
        
        System.out.println("Valor total do item 3: "+item3.getValorTotal());
        
        
        System.out.println("Total da Nota: "+nota1.getValorTotalNota());
        
        System.out.println("Itens da Nota: "+nota1.getQuantidadeDeItens());
        
    }
    
}
