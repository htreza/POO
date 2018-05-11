
package br.com.bandtec.app;

import br.com.bandtec.modelo.Aluno;


public class AppAlunos {
    
    public static void main(String[] args) {
        
        //dois objetos com parametros identicos
        //mas são o mesmo objeto
        Aluno aluno1 = new Aluno(1, "jota");
        Aluno aluno2 = new Aluno(1, "jota");
        
        // verifica se são o mesmo objeto em memória
        if (aluno1 == aluno2){
            System.out.println("risada");
        }else{
            System.out.println("objetos com mesmos parametros, mas com endereços diferentes, dá certo se tem metodos hashcode e equals");
        }
        
        if(aluno1.equals(aluno2)){
            System.out.println("aluno1 tem os mesmos valores de aluno2, dá certo se tem metodos hashcode e equals");
        }else{
            System.out.println("ainda não funciona, são objetos diferentes");
        }
        
        //aluno3 não é novo objeto, é uma referencia ao aluno2
        Aluno aluno3 = aluno2;
        if(aluno2 == aluno3){
            System.out.println("3 e 2 são os mesmos, e aluno3 herda os metodos de aluno, com hashocode e equals");
        }
        
        aluno2.setNome("jose");
        System.out.println("o aluno3 também chama "+aluno3.getNome()+" que foi atribuido a aluno2");
    }
    
}
