package app;

//importando com ctrl+space
import modelo.CaixaEletronico;


public class AppCaixasEketronicos {
    
    public static void main(String[] args) {
        // Instanciando / criando um CaixaEletronico
        //Objetos do tipo CaixaEletronico
        
        CaixaEletronico caixaA = new CaixaEletronico();
        CaixaEletronico caixaB = new CaixaEletronico();
        
        caixaA.depositar(100);
        caixaB.depositar(800);
        
        caixaA.sacar(150);
        caixaB.sacar(300);
        
        System.out.println("Quais os bancos de A? "+caixaA.bancosDisponiveis());
        
        caixaA.configurarBancos("Banco Brasil, Banco Carioca");
        caixaB.configurarBancos("Banco Paulista");
        
        System.out.println("Quais os bancos do A? "+caixaA.bancosDisponiveis());
        
        System.out.println("Quais os bancos do B? "+caixaB.bancosDisponiveis());
        
    }
    
}
