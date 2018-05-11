package br.com.bandtec.estabelecimentosjpa.model;

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

@Entity
@Table(name="tipo_estabelecimento")
public class TipoEstabelecimento implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //@Column(name = "id_tipo_estabelecimento")
    private Long id;
    
    @Column(length = 40, nullable = false)
    private String nome;
    
    @CreationTimestamp // indica que o campo recebrá a data e hora atual no insert
    @Temporal(TemporalType.TIMESTAMP) // tipo de data no banco
    @Column(name = "data_criacao")
    private Calendar dataCriacao;

    public TipoEstabelecimento() {
    }
  

    public TipoEstabelecimento(String nome) {
        this.nome = nome;
    }

    public Calendar getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Calendar dataCriacao) {
        this.dataCriacao = dataCriacao;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

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
        return "br.com.bandtec.estabelecimentosjpa.model.TipoEstabelecimento[ id=" + id + " ]";
    }
    
}
