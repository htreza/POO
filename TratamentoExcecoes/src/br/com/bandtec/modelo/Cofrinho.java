package br.com.bandtec.modelo;

public class Cofrinho {

    private double valor;
    private boolean quebrado = false;

    //construtor com valor inicial obrigatorio 
    public Cofrinho(double valor) throws Exception {
        
        if(valor < 0){
            throw new Exception("Não é possivel criar com valor negativo");
        }
        this.valor = valor;
    }

    //"thrws Exception" indica que o metodo informa ao user que pode gerar exceções
    public void depositar(double valorDeposito) throws Exception {

         //regra de negocio
        if (this.quebrado){
            throw new Exception("O cofrinho está quebrado");
        }
        
        //regra de negocio
        if (valorDeposito < 0) {
            //"throw" FINALIZA o metodo,lançando uma exceção
            throw new Exception("Não é possivel depositar valor negativo");
        }
        this.valor += valorDeposito;

    }
    
    public void quebrar(){
        this.quebrado = true;
    }

    //metodo get padrao
    public double getValor() {
        return valor;
    }
    
    

}
