package br.com.gpaiva;

import br.com.gpaiva.dao.ILivroDao;
import br.com.gpaiva.dao.LivroDao;
import br.com.gpaiva.domain.Livro;
import org.junit.Test;

import static org.junit.Assert.*;

public class LivroTest {

    private ILivroDao livroDao;

    public LivroTest(){
        livroDao = new LivroDao();
    }

    @Test
    public void cadastrar(){
        Livro livro = new Livro();
        livro.setCodigo("A1");
        livro.setAutor("Autor Test");
        livro.setDescricao("Teste descrição livro");
        livro.setNome("Livro de Java Backend");
        livro = livroDao.cadastrar(livro);

        assertNotNull(livro);
        assertNotNull(livro.getId());

        assertTrue(livroDao.excluir(livro.getId()));
    }

}
