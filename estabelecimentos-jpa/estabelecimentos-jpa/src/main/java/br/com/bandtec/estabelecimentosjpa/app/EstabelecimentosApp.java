package br.com.bandtec.estabelecimentosjpa.app;

import br.com.bandtec.estabelecimentosjpa.db.Conexao;
import br.com.bandtec.estabelecimentosjpa.model.TipoEstabelecimento;
import br.com.bandtec.estabelecimentosjpa.repository.TipoEstabelecimentoRepository;
import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManager;

public class EstabelecimentosApp {
    
    public static void main(String[] args) {
        try {
            
            Conexao conexao = new Conexao();

            // criando o Repository
            TipoEstabelecimentoRepository repository
                    = new TipoEstabelecimentoRepository(conexao);

            // criando um novo tipo de estebelecimento
            TipoEstabelecimento novo1 = new TipoEstabelecimento("Hostel");
            TipoEstabelecimento novo2 = new TipoEstabelecimento("Padaria");
//            repository.salvar(novo1);
//            repository.salvar(novo2);

            // recuperando todos os registros
            List<TipoEstabelecimento> todos
                    = repository.recuperar3Ultimos();
            for (TipoEstabelecimento registro : todos) {
                System.out.println("Id: " + registro.getId());
                System.out.println("Nome: " + registro.getNome());
                System.out.println();
            }

            // recuperando apenas 1 pela chave
            Scanner leitor = new Scanner(System.in);
            System.out.println("Qual id de tipo de estabelecimento?");
            long id = leitor.nextLong();
            
            TipoEstabelecimento recuperado = repository.recuperar(id);
            
            if (recuperado != null) {
                System.out.println("Encontrado: "
                        + "id - " + recuperado.getId() + " - " + recuperado.getNome());
            } else {
                System.out.println("Não existe tipo de estabelecimento com id " + id);
            }
            
            conexao.comitarFechar();
            
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        } finally {
            System.exit(0);
        }
    }
    
}
