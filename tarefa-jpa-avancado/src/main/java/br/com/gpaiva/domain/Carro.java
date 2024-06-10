package br.com.gpaiva.domain;

import javax.persistence.*;
import java.util.List;
import java.util.ArrayList;

@Entity
@Table(name = "TB_CARRO")
public class Carro {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "carro_seq")
    @SequenceGenerator(name = "carro_seq", sequenceName = "sq_carro", initialValue = 1, allocationSize = 1)
    private Long id;

    @Column(name = "MODELO", length = 50, nullable = false)
    private String modelo;

    @Column(name = "CODIGO", length = 10, nullable = false, unique = true)
    private String codigo;

    @Column(name = "ANO", nullable = false)
    private int ano;

    @ManyToOne
    @JoinColumn(name = "id_marca_fk",
            foreignKey = @ForeignKey(name = "fk_marca_carro"),
            referencedColumnName = "id", nullable = false
    )
    private Marca marca;

    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "TB_CARRO_ACESSORIO",
            joinColumns = { @JoinColumn(name = "id_carro_fk") },
            inverseJoinColumns = { @JoinColumn(name = "id_acessorio_fk") }
    )
    private List<Acessorio> acessorios = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public List<Acessorio> getAcessorios() {
        return acessorios;
    }

    public void setAcessorios(List<Acessorio> acessorios) {
        this.acessorios = acessorios;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void addAcessorio(Acessorio acessorio) {
    }
}
