package ResponsabilidadeUnica;

public class Responsabilidades {

    private double area;
    private double lado;
    private int linha;

    //construtor
    public Responsabilidades(double area, double lado, int linha) {
        this.area = area;
        this.lado = lado;
        this.linha = linha;
    }

    public double CalcularArea(double area) {
        return this.lado * this.lado;
    }

    ;
    
    public int desenharForma(int linha) {

        return this.linha * 4;
    }

    ;

    
            
            
    
    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getLinha() {
        return linha;
    }

    public void setLinha(int linha) {
        this.linha = linha;
    };

}
