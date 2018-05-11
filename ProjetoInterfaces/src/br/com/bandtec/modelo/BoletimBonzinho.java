package br.com.bandtec.modelo;

// uma classe só pode ser implementada, não extendida
public class BoletimBonzinho implements Boletim {

    private double nota1;
    private double nota2;

    //construtor criado (alt + insert)
    //construtor = sempre nome da classe + parametros
    public BoletimBonzinho(double nota1, double nota2) {
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    //implementação obrigatoria dos metodos
    @Override
    public boolean isAprovado() {
        return (this.nota1 + this.nota2) / 2 > 5;

    }

}
