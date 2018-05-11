
package br.com.bandtec.app;

import br.com.bandtec.enums.FaixaEtaria;
import br.com.bandtec.enums.RendaFamiliar;
import br.com.bandtec.modelo.Cliente;


public class AppClientes {
    
    public static void main(String[] args) {
        
        
        Cliente clienteA = new Cliente("Maggie",FaixaEtaria.INFANCIA);
        Cliente clienteB = new Cliente("Lisa",FaixaEtaria.ADOLESCENCIA);
        Cliente clienteC = new Cliente ("Hommer",FaixaEtaria.ADULTO);
        Cliente clienteD = new Cliente ("Burns",FaixaEtaria.IDOSO);
        
        System.out.println("Cliente A é : "+clienteA.getFaixaEtaria());
        System.out.println("Cliente B é : "+clienteB.getFaixaEtaria());
        System.out.println("Cliente C é : "+clienteC.getFaixaEtaria());
        System.out.println("Cliente D é : "+clienteD.getFaixaEtaria());
        System.out.println("Cliente A é : "+clienteA.getNome());
        
        clienteA.setRendaFamiliar(RendaFamiliar.CLASSE_B);
        
        System.out.println("A cliente A é : "+clienteA.getRendaFamiliar().getDescricao());
        System.out.println("A cliente A ganha no máximo : "+clienteA.getRendaFamiliar().getMaximo());
        System.out.println("A cliente A ganha no minimo : "+clienteA.getRendaFamiliar().getMinimo());
        
        //System.out.println("A cliente B é : "+clienteB.getNome()+clienteB.getRendaFamiliar().getDescricao());
        
    }
    
}
