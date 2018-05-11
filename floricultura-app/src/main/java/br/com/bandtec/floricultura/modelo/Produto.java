package br.com.bandtec.floricultura.modelo;

import br.com.bandtec.floricultura.enums.TipoFlor;

public class Produto {

    private Integer id;
    private Flor flor;
    private double valorCompra;
    private TipoFlor tipoFlor;

    public Produto(Integer id, Flor flor, double valorCompra, TipoFlor tipoFlor) {
        this.id = id;
        this.flor = flor;
        this.valorCompra = valorCompra;
        this.tipoFlor = tipoFlor;
    }

    public Integer getId() {
        return id;
    }

    public Flor getFlor() {
        return flor;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public TipoFlor getTipoFlor() {
        return tipoFlor;
    }

    public double getPrecoVenda() {
        return this.valorCompra + this.valorCompra * this.tipoFlor.getMargemLucro() / 100;
    }
}
