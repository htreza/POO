package modelo;

import enums.TipoFlor;

public class Produto {

    private int id;
    private Flor flor;
    private double valorCompra;
    private TipoFlor tipoFlor;

    public Produto(int id, Flor flor, double valorCompra, TipoFlor tipoFlor) {
        this.id = id;
        this.flor = flor;
        this.valorCompra = valorCompra;
        this.tipoFlor = tipoFlor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Flor getFlor() {
        return flor;
    }

    public void setFlor(Flor flor) {
        this.flor = flor;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public TipoFlor getTipoFlor() {
        return tipoFlor;
    }

    public void setTipoFlor(TipoFlor tipoFlor) {
        this.tipoFlor = tipoFlor;
    }

    public double getPrecoVenda() {
        return valorCompra * tipoFlor.getMargemLucro() / 100;
    }

}
