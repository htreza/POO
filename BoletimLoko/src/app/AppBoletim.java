package app;

import java.util.Scanner;
import modelo.Boletim;



public class AppBoletim {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner (System.in);
        
        Boletim boletimA = new Boletim();
        Boletim boletimB = new Boletim();
        
        System.out.println("Digite a primeira nota A: ");
        Double nota1 = leitor.nextDouble();
        
        System.out.println("Digite a segunda nota A: ");
        Double nota2 = leitor.nextDouble();
        
        boletimA.alterarNota1(nota1);
        boletimA.alterarNota2(nota2);
                       
        System.out.println("A Media final de A foi "+boletimA.mediaFinal()+" e foi "+boletimA.resultadoFinal());
        
        System.out.println("Digite a primeira nota B: ");
        Double nota3 = leitor.nextDouble();
        
        System.out.println("Digite a segunda nota B: ");
        Double nota4 = leitor.nextDouble();
        
        boletimB.alterarNota1(nota3);
        boletimB.alterarNota2(nota4);
                       
        System.out.println("A Media final de B foi "+boletimB.mediaFinal()+" e foi "+boletimB.resultadoFinal());
        
    }
    
}
