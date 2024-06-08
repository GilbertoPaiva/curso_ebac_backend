package br.com.gpaiva.dao;

import br.com.gpaiva.domain.Produto;

public interface IProdutoDao {

public Produto cadastrar(Produto produto);

public boolean excluir(Long id);
}
