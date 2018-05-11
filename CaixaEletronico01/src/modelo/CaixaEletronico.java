
package modelo;

public class CaixaEletronico {
    
    //atributos de instancia Privado "bancos"
    private String bancos;
    
    private int horarioInicio;
    
    private int horarioFim;
    
    private double dinheiro;
    
    //Metodo publico "sacar"
    
    public void sacar(double valorSolicitado){
        
        if(this.dinheiro >= valorSolicitado){
            this.dinheiro -= valorSolicitado;
            System.out.println(valorSolicitado+" sacado com sucesso."+" Saldo: "+this.dinheiro);
        }else{
            System.out.println("Valor solicitado não pode ser sacado");
        }
    }
    // metodo para depositar
    public void depositar(double valorDeposito){
        this.dinheiro += valorDeposito;
        System.out.println(valorDeposito+" depositado com sucesso!");
    }
    
    //metodo para configuras os bancos
    public void  configurarBancos(String novosBancos){
        this.bancos = novosBancos;
    }
    
    public String bancosDisponiveis(){
        // operador ternario para verificar se há informação em Bancos
        return this.bancos != null ? this.bancos : "Nenhum";
    }
}
