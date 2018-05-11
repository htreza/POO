package br.com.bandtec.estabelecimentosjpa.repository;

//classe abstrata que vai conter os principais metodos do Entity manager
import br.com.bandtec.estabelecimentosjpa.db.Conexao;
import br.com.bandtec.estabelecimentosjpa.model.TipoEstabelecimento;
import javax.persistence.EntityManager;

//classe com tipo GENERIC (no caso T)
//Por padrao se usa T, mas poderia ser qualquer letra ou palavra
public abstract class GenericRepository<T> {

    //protected pode ser usado pelas subclasses
    protected EntityManager em;

    //construtor
    public GenericRepository(Conexao conexao) {
        this.em = conexao.getEm();

    }

    //metodo abstrato, sem corpo, criado em classe abstrata
    protected abstract Class getClasse();

    // receberá um Object pois pode receber qualquer tipo como retorno
    public void salvar(Object entidade) {
        this.em.persist(entidade);
    }

    //metodo generico de recuperar
//    public Object recuperar(Class classe, long id) {
//        return this.em.find(classe, id);
//    }
    //recuperando usando o recurso de GENERICS
//    public <T> T recuperar(Class<T> classe, long id) {
//        return this.em.find(classe, id); // --> de qual tabela e de qual PK
//    }

    //recuperando usando o recurso de GENERICS
    public T recuperar(long id) {
        return this.em.find((Class<T>) this.getClass(), id);
    }
    
    public void excluir(Long id) {
        this.em.remove(this.recuperar(id));
    }

}
