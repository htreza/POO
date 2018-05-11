package br.com.bandtec.estabelecimentosjpa.db;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class Conexao {

    public static final String PU_JPA = "pu-bandtec";
    
    private EntityManager em;

    public Conexao() {
        this.em = Persistence
                .createEntityManagerFactory(PU_JPA).createEntityManager();
        
        this.em.getTransaction().begin();
    }

    public EntityManager getEm() {
        return em;
    }
    
    public void comitarFechar() {
        this.em.getTransaction().commit();
        this.em.close();
    }
    
}
