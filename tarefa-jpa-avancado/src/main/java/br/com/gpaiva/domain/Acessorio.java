package br.com.gpaiva.domain;

import javax.persistence.*;
import java.util.List;
import java.util.ArrayList;

@Entity
@Table(name = "TB_ACESSORIO")
public class Acessorio {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "acessorio_seq")
    @SequenceGenerator(name = "acessorio_seq", sequenceName = "sq_acessorio", initialValue = 1, allocationSize = 1)
    private Long id;

    @Column(name = "NOME", length = 50, nullable = false, unique = true)
    private String nome;

    @Column(name = "CODIGO", length = 10, nullable = false, unique = true)
    private String codigo;

    @Column(name = "DESCRICAO", length = 50, nullable = false)
    private String descricao;

    @ManyToMany(mappedBy = "acessorios")
    private List<Carro> carros = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Carro> getCarros() {
        return carros;
    }

    public void setCarros(List<Carro> carros) {
        this.carros = carros;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
