package br.com.bandtec.app;

//Powered by Henrique Treza
import br.com.bandtec.modelo.Aluno;

public class AppAlunos {

    public static void main(String[] args) {
//Igual igual == O java pergunta se é o mesmo cara. Verifica se é o mesmo 
// Objeto na memoria.
        Aluno aluno1 = new Aluno(1, "Tesla");
        Aluno aluno2 = new Aluno(1, "Tesla");
        
        if (aluno1 == aluno2){
            System.out.println("Aluno1 é o Aluno2");
        }
        if (aluno1.equals(aluno2)){
            System.out.println("Aluno1 tem os mesmos valores de Aluno2");
        }
        
        Aluno aluno3 = aluno2;
        if (aluno2 == aluno3){
            System.out.println("3 e 2 são o MESMO!!!");
        }
        
        aluno2.setNome("Musk");
        System.out.println(aluno3.getNome());
        

    }

}
