package br.com.gpaiva.dao;

import br.com.gpaiva.domain.Livro;

public interface ILivroDao {

public Livro cadastrar(Livro livro);

public boolean excluir(Long id);
}
