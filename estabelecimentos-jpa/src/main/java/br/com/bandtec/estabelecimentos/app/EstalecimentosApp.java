package br.com.bandtec.estabelecimentos.app;

import br.com.bandtec.estabelecimentos.model.TipoEstabelecimento;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class EstalecimentosApp {

    public static void main(String[] args) {

        //bloco de exceção para encerrar quando der problema no ORM
        try {
            //persistence-unit que está no persistence.xml = nome da conexão
            //um EntityManager é como se fosse uma conexão com o BD
            EntityManager em = Persistence.createEntityManagerFactory("pu-bandtec").createEntityManager();

            TipoEstabelecimento tipoEstabelecimento = new TipoEstabelecimento("Restaurante");
            TipoEstabelecimento tipoEstabelecimento2 = new TipoEstabelecimento("Hotel");

            //abrindo uma transação
            em.getTransaction().begin();

            //salvando o "tipoEstabelecimento" no banco
            em.persist(tipoEstabelecimento);
            em.persist(tipoEstabelecimento2);

            //confirmando a transação
            em.getTransaction().commit();

            //fechando o EntityManager
            em.close();

        } catch (Exception e) {
            //exibir as linhas da exceção gerada
            e.printStackTrace();
            throw e;
        } finally {
            System.exit(0);
        }

    }

}
