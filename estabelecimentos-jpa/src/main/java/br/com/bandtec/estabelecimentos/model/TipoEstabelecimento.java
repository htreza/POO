package br.com.bandtec.estabelecimentos.model;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.CreationTimestamp;

/**
 *
 * @author aluno
 */
@Entity
@Table(name = "tipo_estabelecimento")
public class TipoEstabelecimento implements Serializable {

    private static final long serialVersionUID = 1L;

    //chave primaria
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 40, nullable = false)
    private String nome;

    //todos comentários de banco precisam ser importados ctrl+espaço
    @CreationTimestamp // coloca o dia/hora no momento da criação do registro. Recomendada para datas
    @Temporal(TemporalType.TIMESTAMP)// tipo de data no banco
    @Column(name = "data_criacao")
    private Calendar dataCriacao;

    public Calendar getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Calendar dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    //construtor
    public TipoEstabelecimento(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    //criado automaticamente para comparar objetos
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    //criado automaticamente para comparar objetos
    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoEstabelecimento)) {
            return false;
        }
        TipoEstabelecimento other = (TipoEstabelecimento) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.bandtec.estabelecimentos.model.TipoEstabelecimento[ id=" + id + " ]";
    }

}
