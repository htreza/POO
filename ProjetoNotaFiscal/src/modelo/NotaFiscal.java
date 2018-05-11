package modelo;

import java.util.ArrayList;
import java.util.List;

public class NotaFiscal {

    private String estabelecimento;
    private String dataCompra;

    //array para guardar os produtos
    //desvantagem de ter tamanho fixo
    //private Item[] itens;
    // Diamond Operator -- < nessa lista somente objetos do tipo Item >
    // não é obrigado a colocar o tipo no <> da direita, nem determinar o tamanho no ()
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

    // metodo com parametros da classe Item - objeto item(que é uma lista)
    public void adcicionarItem(Item item) {

        //adicionando um item em uma lista
        this.itens.add(item);

    }

    // metodo get para "contar" a quantidade de itens
    public int getQuantidadeDeItens() {
        //recuperando o tamanho de uma lista, quantos itens foram adcionados

        return this.itens.size();

    }

    // metodo get para somar os valores de cada item
    public double getValorTotalNota() {

        double total = 0;

        //for each ou enhaced fo
        //para percorrer a lista
        // usado quando só se quer saber o valor da lista
        for (Item item : this.itens) {
            // aqui cada "item" é um objeto da lista na interção    
            total += item.getValorTotal();

        }

        // não precisa do this.total pois não é uma variavel de instancia
        return total;

    }

}
