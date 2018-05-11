package app;

import modelo.Item;
import modelo.NotaFiscal;


 // Powered by Henrique Treza
public class AppNotasFiscais {

    public static void main(String[] args) {
        //Criando uma Instância
        NotaFiscal nota1 = new NotaFiscal();
        
         Item item1 = new Item("Feijão", 1, 5.5);
         Item item2 = new Item("Yogurte", 10, 9);
         Item item3 = new Item("Picanha", 3, 4.5);
         
         nota1.adicionarItem(item1);
         nota1.adicionarItem(item2);
         nota1.adicionarItem(item3);
         
         
         System.out.println("Valor total do #1: " +item1.getValorTotal());
         System.out.println("Valor total do #2: " +item2.getValorTotal());
         System.out.println("Valor total do #3: " +item3.getValorTotal());
                
         
         System.out.println("Total da Nota: " +nota1.getValorTotalNota());
         System.out.println("Itens na Nota: " +nota1.getQuantidadeItens());
         
    }
    
}
