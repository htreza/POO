
package br.com.bandtec.estabelecimentosjpa.repository;

import br.com.bandtec.estabelecimentosjpa.db.Conexao;
import br.com.bandtec.estabelecimentosjpa.model.Estabelecimento;
import java.util.List;



public class EstabelecimentoRepository extends GenericRepository<Estabelecimento>{
    
    public EstabelecimentoRepository (Conexao conexao){
        super(conexao);
    }
    
    public List<Estabelecimento> recuperarEstabelecimentoPorNomeContendo(String termo) {
        return this.em.createQuery(
                "from TipoEstabelecimento where nome like ?")
                .setParameter(1, "%"+termo+"%")
                .getResultList();
    }
    
    public List<Estabelecimento> recuperarTodosEstabelecimentos() {
        return this.em.
                createQuery("from Estabelecimento").getResultList();
        
    }

    @Override
    protected Class getClasse() {
         return Estabelecimento.class;
    }
    
    
    
    
}
