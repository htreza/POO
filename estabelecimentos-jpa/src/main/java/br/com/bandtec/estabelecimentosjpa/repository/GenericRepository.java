package br.com.bandtec.estabelecimentosjpa.repository;

import br.com.bandtec.estabelecimentosjpa.db.Conexao;
import br.com.bandtec.estabelecimentosjpa.model.TipoEstabelecimento;
import javax.persistence.EntityManager;

// Classe com tipo GENRIC (no caso, o T)
// Usamos a letra T, mas poderia ser quanquer letra ou palavra
public abstract class GenericRepository<T> {

    protected EntityManager em;

    public GenericRepository(Conexao conexao) {
        this.em = conexao.getEm();
    }
    
    protected abstract Class getClasse();

    public void salvar(Object entidade) {
        this.em.persist(entidade);
    }

    // recuperar usando o recurso de GENERICS
    public  T  recuperar(Long id) {
        return this.em.find((Class<T>) this.getClasse(), id);
    }

    public void excluir(Long id) {
        this.em.remove(this.recuperar(id));
    }

}
