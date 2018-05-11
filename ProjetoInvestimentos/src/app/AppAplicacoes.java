
package app;

import modelo.Poupanca;


public class AppAplicacoes {
    
    public static void main(String[] args) {
        
        //Importando e estanciando a classe Poupanca
        Poupanca poupanca1 = new Poupanca();
        poupanca1.aplicar(46);
        poupanca1.sacar(6);
        
        poupanca1.atualizarTitular("Ze Mane");
        
        System.out.println("Saldo atual: "+poupanca1.saldo());
        System.out.println("Titular atual: "+poupanca1.titular());
        
        Poupanca poupanca2 = new Poupanca();
        poupanca2.aplicar(100);
        poupanca2.atualizarTaxa(1);
        poupanca2.render();
        System.out.println("novo saldo: "+poupanca2.saldo());
    }
    
}
