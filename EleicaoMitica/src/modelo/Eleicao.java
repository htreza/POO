package modelo;

public class Eleicao {

    private int candidato1;
    private int candidato2;
    private int brancos;
    private int nulos;
    private String resultado;

    public void votarCanditato1(int UmVoto) {

        this.candidato1 += UmVoto;
    }

    public void votarCandidato2(int UmVoto) {

        this.candidato2 += UmVoto;
    }

    public void votoBranco(int UmVoto) {

        this.brancos += UmVoto;
    }

    public void votoNulo(int UmVoto) {

        this.nulos += UmVoto;
    }

    public void encerrarVotacao() {

        if (candidato1 > candidato2) {
            this.resultado = "candidato1";
        }
        if (candidato1 < candidato2) {
            this.resultado = "candidato2";
        }
        if (candidato1 == candidato2) {
            this.resultado = "Empate";

        }
    }
    
    public String retornaResultado(){
        
        return this.resultado;
    }

}
