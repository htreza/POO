package br.com.bandtec.estabelecimentosjpa.app;

import br.com.bandtec.estabelecimentosjpa.db.Conexao;
import br.com.bandtec.estabelecimentosjpa.model.TipoEstabelecimento;
import br.com.bandtec.estabelecimentosjpa.repository.TipoEstabelecimentoRepository;
import br.com.bandtec.estabelecimentosjpa.utils.IOUtils;
import java.util.List;
import java.util.Scanner;

public class MenuPrincipal {
    
    private final static String MENSAGEM_MENU
            = "Estabelecimentos APP - Tela Inicial\n"
            + "1 - Cadastrar Tipo de Estabalecimentos\n"
            + "2 - Listar todos os Tipos de Estabelecimentos\n"
            + "3 - Pesquisar Tipo de Estabalecimento\n"
            + "4 - Atualizar\n"
            + "5 - Excluir Tipo de Estabelecimento\n"
            + "NDA - Sair";
    
    public static void executar() {
        
        Scanner leitor = new Scanner(System.in);

        //laço com repetição infinita
        //"Loop Etiquetado"
        //Label para o Laço, para invocar esse laço especifico em algum ponto dentro de outro laço
        menu:
        while (true) {
            
            int escolha = IOUtils.lerInt(MENSAGEM_MENU);
            
            Conexao conexao = new Conexao();
            
            TipoEstabelecimentoRepository repository
                    = new TipoEstabelecimentoRepository(conexao);
            
            switch (escolha) {
                case 1:
                    
                    TipoEstabelecimento registro = new TipoEstabelecimento();
                    registro.setNome(IOUtils.lerString("Nome do tipo de estabalecimento"));
                    
                    repository.salvar(registro);
                    
                    break;
                case 2:
                    
                    for (TipoEstabelecimento registro2 : repository.recuperarTodos()) {
                        System.out.println(registro2);
                    }
                    
                    break;
                case 3:
                    
                    String pesquisa = IOUtils.lerString("Pesquisa");
                    
                    List<TipoEstabelecimento> resultado = repository.recuperarPorNomeContendo(pesquisa);
                    
                    System.out.println("Registros da pesquisa: ");
                    for (TipoEstabelecimento registro3 : repository.recuperarTodos()) {
                        System.out.println(registro3);
                    }
                    
                    break;
                
                case 4:
                    
                    long idAtualizar
                            = IOUtils.lerInt("Qual o ID do registro a ser atualizado? ");
                    
                    TipoEstabelecimento recuperado
                            = repository.recuperar(idAtualizar);
                    
                    recuperado.setNome(IOUtils.lerString("Qual o novo nome"));
                    
                    break;
                
                case 5:
                    
                    long idExcluir
                            = IOUtils.lerInt("Qual o ID do registro a ser excluido? ");
                    
                    repository.excluir(idExcluir);
                    
                    break;
                
                default:
                    conexao.comitarFechar(); // para fechar a conexão quando o user escolher outra opção
                    break menu; // break do laço com essa etiqueta especifica

            }
            
            conexao.comitarFechar();
        }
        
    }
    
}
