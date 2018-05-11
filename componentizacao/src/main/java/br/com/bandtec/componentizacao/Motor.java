package br.com.bandtec.componentizacao;

public class Motor {

    //heranças do tipo "has a" 
    private Vela vela;
    private Pistao pistao;
    private Alternador alternador;
    private Engrenagens engrenagem;

    //construtor que inicia um novo objeto a cada vez que é chamado
    public Motor() {
        this.vela = new Vela();
        this.pistao = new Pistao();
        this.alternador = new Alternador();
        this.engrenagem = new Engrenagens();
    }

    public void produzirFaiscaIgnição() {
        this.vela.produzirFaisca();
    }

    public void bombearCombustivel(double volume) {
        this.pistao.bombearCombustivel(volume);
    }

    public double converterEnergia(double energiaMecanica) {
        return this.alternador.converteEnergia(energiaMecanica);
    }
    
    public void girarCorreia(int rpm){
        this.engrenagem.girar(rpm);
    }

}
