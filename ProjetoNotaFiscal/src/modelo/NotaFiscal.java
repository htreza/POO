package modelo;

//Powered by Henrique Treza

import java.util.ArrayList;
import java.util.List;

public class NotaFiscal {

    private String estabelecimento;
    private String dataCompra;
    
    /*Fazer da forma Array(Vetores)
    private Item[] itens;
    */
    //Colletion list do JAVA
    //Forma Orientada a Objetos, Lista que só aceita Item.
    private List<Item> itens = new ArrayList<>();

    /**
     * @return the estabelecimento
     */
    public String getEstabelecimento() {
        return estabelecimento;
    }

    /**
     * @param estabelecimento the estabelecimento to set
     */
    public void setEstabelecimento(String estabelecimento) {
        this.estabelecimento = estabelecimento;
    }

    /**
     * @return the dataCompra
     */
    public String getDataCompra() {
        return dataCompra;
    }

    /**
     * @param dataCompra the dataCompra to set
     */
    public void setDataCompra(String dataCompra) {
        this.dataCompra = dataCompra;
    }

    /**
     * @return the itens
     */
    public List<Item> getItens() {
        return itens;
    }
    //Alterar algo, usa o VOID
    public void adicionarItem(Item item) {
        // Adicionando um item em uma lista  .add
        this.itens.add(item);
    }
    
    public int getQuantidadeItens() {
        //recuperando o tamanho da lista
        //quantos itens foram adicionados  .size
        return this.itens.size();
    }
    
    //Pegar o valor de todos os itens.
    public double getValorTotalNota() {
        double total = 0;
        //FOR EACH
        //ENHACED FOR
        // Usa esse FOR somente quando vocÊ quer o valor.
        for (Item item : this.itens) {
            //aqui, cada "item" é um objeto da lista na iteração.
            total += item.getValorTotal();
        }
        // não precisa do this.total pois não é uma variavel de instância
        return total;
    }
}
