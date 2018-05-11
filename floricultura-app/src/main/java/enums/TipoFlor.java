package enums;

public enum TipoFlor {
    COMUM(10.0),
    NOBRE(25.0),
    RARA(50.0);

    private double margemLucro;

    private TipoFlor(double margemLucro) {
        this.margemLucro = margemLucro;
    }

    public double getMargemLucro() {
        return margemLucro;
    }
    
}
