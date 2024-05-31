package br.com.gpaiva;

import br.com.gpaiva.dao.*;
import br.com.gpaiva.dao.ProdutoDAO;
import br.com.gpaiva.domain.Produto;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ProdutoTest {
    
    private IProdutoDAO produtoDAO;
    
    @Test
    public void cadastrarProdutoTest() throws Exception{
        produtoDAO = new ProdutoDAO();
        
        Produto produto = new Produto();
        produto.setCodigo("11");
        produto.setNome("Smartphone");
        produto.setPreco("3000");
        
        Integer qtd = produtoDAO.cadastrar(produto);
        assertTrue(qtd == 1);
        
        Produto produtoBD = produtoDAO.buscar("11");
        assertNotNull(produtoBD);
        assertEquals(produto.getCodigo(), produtoBD.getCodigo());
        assertEquals(produto.getNome(), produtoBD.getNome());
        assertEquals(produto.getPreco(), produtoBD.getPreco());
        
        Integer qtdDel = produtoDAO.excluir(produtoBD);
        assertTrue(qtdDel == 1);
    }

    @Test
    public void buscarTest() throws Exception {
        produtoDAO = new ProdutoDAO();

        Produto produto = new Produto();
        produto.setCodigo("03");
        produto.setNome("Televisão");
        produto.setPreco("5000");
        Integer qtd = produtoDAO.cadastrar(produto);
        assertTrue(qtd == 1);

        Produto produtoBD = produtoDAO.buscar("03");
        assertNotNull(produtoBD);
        assertEquals(produto.getCodigo(), produtoBD.getCodigo());
        assertEquals(produto.getNome(), produtoBD.getNome());
        assertEquals(produto.getPreco(), produtoBD.getPreco());

        Integer qtdDel = produtoDAO.excluir(produtoBD);
        assertTrue(qtdDel == 1);
    }

    @Test
    public void excluirTest() throws Exception{
        produtoDAO = new ProdutoDAO();

        Produto produto = new Produto();
        produto.setCodigo("04");
        produto.setNome("Geladeira");
        produto.setPreco("6000");
        Integer qtd = produtoDAO.cadastrar(produto);
        assertTrue(qtd == 1);

        Produto produtoBD = produtoDAO.buscar("04");
        assertNotNull(produtoBD);
        assertEquals(produto.getCodigo(), produtoBD.getCodigo());
        assertEquals(produto.getNome(), produtoBD.getNome());
        assertEquals(produto.getPreco(), produtoBD.getPreco());

        Integer qtdDel = produtoDAO.excluir(produto);
        assertTrue(qtdDel == 1);
    }

    @Test
    public void buscarTodosTest() throws Exception{
        produtoDAO = new ProdutoDAO();

        Produto produto = new Produto();
        produto.setCodigo("05");
        produto.setNome("Camisa");
        produto.setPreco("60");
        Integer qtd = produtoDAO.cadastrar(produto);
        assertTrue(qtd == 1);

        Produto produtos = new Produto();
        produtos.setCodigo("07");
        produtos.setNome("Test");
        produtos.setPreco("12");
        Integer qtd2 = produtoDAO.cadastrar(produtos);
        assertTrue(qtd2 == 1);

        List<Produto> list = produtoDAO.buscarTodos();
        assertNotNull(list);
        assertEquals(2, list.size());

        int qtdDel = 0;
        for (Produto cli : list){
            produtoDAO.excluir(cli);
            qtdDel++;
        }
        assertEquals(list.size(), qtdDel);

        list = produtoDAO.buscarTodos();
        assertEquals(list.size(), 0);
    }

    @Test
    public void atualizarTest() throws Exception{
        produtoDAO = new ProdutoDAO();

        Produto produto = new Produto();
        produto.setCodigo("01");
        produto.setNome("TV");
        produto.setPreco("5000");
        Integer qtd = produtoDAO.cadastrar(produto);
        assertTrue(qtd == 1);

        Produto produtoBD = produtoDAO.buscar("01");
        assertNotNull(produtoBD);
        assertEquals(produto.getCodigo(), produtoBD.getCodigo());
        assertEquals(produto.getNome(), produtoBD.getNome());
        assertEquals(produto.getPreco(), produtoBD.getPreco());

        produtoBD.setCodigo("02");
        produtoBD.setNome("TV Promoção");
        produtoBD.setPreco("4500");
        Integer qtdUpdate = produtoDAO.atualizar(produtoBD);
        assertTrue(qtdUpdate == 1);

        Produto produtoBD1 = produtoDAO.buscar("01");
        assertNotNull(qtdUpdate);

        Produto produtoBD2 = produtoDAO.buscar("02");
        assertNotNull(produtoBD2);
        assertEquals(produtoBD.getId(), produtoBD2.getId());
        assertEquals(produtoBD.getCodigo(), produtoBD2.getCodigo());
        assertEquals(produtoBD.getNome(), produtoBD2.getNome());
        assertEquals(produtoBD.getPreco(), produtoBD2.getPreco());

        List<Produto> list = produtoDAO. buscarTodos();
        for (Produto pro : list){
            produtoDAO.excluir(pro);
        }
    }
}
