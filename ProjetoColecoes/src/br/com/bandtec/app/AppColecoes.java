package br.com.bandtec.app;

import br.com.bandtec.modelo.Aluno;
import br.com.bandtec.modelo.Turma;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class AppColecoes {

    public static void main(String[] args) {

        Aluno a1 = new Aluno(1, "zé");
        Aluno a2 = new Aluno(2, "joao");
        Aluno a3 = new Aluno(3, "maria");

        //List da classe java.util
        //List aceita elementos repetidos
        List<Aluno> listaAlunos = new ArrayList<>();

        listaAlunos.add(a1);
        listaAlunos.add(a2);
        listaAlunos.add(a3);
        listaAlunos.add(a3);

        System.out.println("quanto alunos na lista? " + listaAlunos.size() + " pq adciona o mesmo objeto mais de uma vez (a3)");

        // como é o mesmo objeto, em todas os usos no sistema será atribuido o novo valor
        a2.setNome("sonia");
        //imprimindo a 2ª posição da lista, com o novo nome atribuido 
        System.out.println("Qual o nome do 2º? " + listaAlunos.get(1).getNome());

        //ainda o mesmo objeto, mas com outro valor atribuido
        listaAlunos.get(1).setNome("Roberto");
        System.out.println("Nome da 2ª posição agora é " + a2.getNome());

        //Set e HashSet importados da classe java.util
        //declarado como set, instanciado como HashSet --> HashSet organiza pelo pelo HashCode do objeto
        //implementação HashSet não guarda pela ordem de adição
        //como HashSet a busca fica mais rapida, pois está indexada
        Set<Aluno> conjuntoAlunos = new HashSet<>();

        conjuntoAlunos.add(a1);
        conjuntoAlunos.add(a2);
        conjuntoAlunos.add(a3);
        conjuntoAlunos.add(a3);

        // Set não aceita elementos repetidos
        System.out.println("Quantos no conjunto? " + conjuntoAlunos.size());

        //mesmo sendo novo objeto, não entre no Set porque os metodos equals e Hashcode herdados fazem a comparação
        Aluno a4 = new Aluno(a1.getMatricula(), a1.getNome());
        conjuntoAlunos.add(a4);
        System.out.println("quantos no conjunto? " + conjuntoAlunos.size());

        Turma t1 = new Turma();
        Turma t2 = new Turma();
        Turma t3 = new Turma();

        List<Turma> listaTurmas = new ArrayList<>();
        listaTurmas.add(t1);
        listaTurmas.add(t2);
        listaTurmas.add(t3);

        Set<Turma> setTurmas = new HashSet();
        setTurmas.add(t1);
        setTurmas.add(t2);
        setTurmas.add(t3);

        //implementação como LinkedHashSet coloca na ordem de adiçao e com index de Hashcode
        Set<Turma> setTurmas2 = new LinkedHashSet<>();
        setTurmas2.add(t1);
        setTurmas2.add(t2);
        setTurmas2.add(t3);

    }

}
