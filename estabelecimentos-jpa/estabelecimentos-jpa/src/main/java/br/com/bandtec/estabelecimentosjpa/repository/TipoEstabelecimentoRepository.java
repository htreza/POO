package br.com.bandtec.estabelecimentosjpa.repository;

import br.com.bandtec.estabelecimentosjpa.db.Conexao;
import br.com.bandtec.estabelecimentosjpa.model.TipoEstabelecimento;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

public class TipoEstabelecimentoRepository extends GenericRepository <TipoEstabelecimento> {

    //construtor criado pela chamada da classe pai abstrata
    public TipoEstabelecimentoRepository(Conexao conexao) {
        super(conexao);
    }

//    private Conexao conexao;
// pode ser apagado pois jã existe na classe pai abstrata
//    private EntityManager em;
//    //metodo que abstrai o conexao.getEm para evitar repetição deste
//    private EntityManager getEm(){
//        return this.conexao.getEm();
//    }
    public List<TipoEstabelecimento> recuperarTodos() {
        return this.em.
                createQuery("from TipoEstabelecimento").getResultList();
    }

    //para casos que exigem multipla escolha, usando Criteria
    public List<TipoEstabelecimento> recuperarTodos2() {
        CriteriaQuery<TipoEstabelecimento> query = this.em
                .getCriteriaBuilder()
                .createQuery(TipoEstabelecimento.class);

        return this.em.
                createQuery("from TipoEstabelecimento").getResultList();
    }

    //recuper ordenando, em ordem decrescente
    public List<TipoEstabelecimento> recuperar3Ultimos() {
        return this.em.
                createQuery("from TipoEstabelecimento order by id desc")
                .setMaxResults(3)
                .getResultList();
    }

    //excluindo direto sem recuperar
    public void excluir2(Long id) {
        this.em
                .createQuery("delete from TipoEstabelecimento where id=?")
                .setParameter(1, id)
                .executeUpdate();
    }

    public List<TipoEstabelecimento> recuperarPorOrdemAlfabetica() {
        return this.em.createQuery(
                "from TipoEstabelecimento order by nome").getResultList();
    }

    public List<TipoEstabelecimento> recuperarPorNome(String nome) {
        return this.em.createQuery(
                "from TipoEstabelecimento where nome = ?")
                .setParameter(1, nome)
                .getResultList();
    }

    //like faz fullscanner no BD, só fazer em tabelas pequenas
    public List<TipoEstabelecimento> recuperarPorNomeContendo(String termo) {
        return this.em.createQuery(
                "from TipoEstabelecimento where nome like ?")
                .setParameter(1, "%" + termo + "%")
                .getResultList();
    }

    //implementacao obrigatoria do metodo abstrato da classe pai
    @Override
    protected Class getClasse() {
        return TipoEstabelecimento.class;
    }

}
