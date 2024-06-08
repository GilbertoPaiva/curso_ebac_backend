package br.com.gpaiva;

import br.com.gpaiva.dao.IProdutoDao;
import br.com.gpaiva.dao.ProdutoDao;
import br.com.gpaiva.domain.Produto;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProdutoTest {

    private IProdutoDao produtoDao;

    public ProdutoTest(){
        produtoDao = new ProdutoDao();
    }

    @Test
    public void cadastrar(){
        Produto produto = new Produto();
        produto.setCodigo("A1");
        produto.setPreco(13L);
        produto.setDescricao("Teste descrição produto");
        produto.setNome("Produto ");
        produto = produtoDao.cadastrar(produto);

        assertNotNull(produto);
        assertNotNull(produto.getId());

        assertTrue(produtoDao.excluir(produto.getId()));
    }

}
