package br.com.gpaiva;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import br.com.gpaiva.dao.ClienteDAO;
import br.com.gpaiva.dao.IClienteDAO;
import br.com.gpaiva.domain.Cliente;

import java.util.List;

public class ClienteTest {

    private IClienteDAO clienteDAO;

    @Test
    public void cadastrarTest() throws Exception {
        clienteDAO = new ClienteDAO();

        Cliente cliente = new Cliente();
        cliente.setCodigo("01");
        cliente.setNome("Gilberto Paiva");

        Integer qtd = clienteDAO.cadastrar(cliente);
        assertTrue(qtd == 1);

        Cliente clienteBD = clienteDAO.buscar("10");
        assertNotNull(clienteBD);
        assertEquals(cliente.getCodigo(), clienteBD.getCodigo());
        assertEquals(cliente.getNome(), clienteBD.getNome());

        Integer qtdDel = clienteDAO.excluir(clienteBD);
        assertTrue(qtdDel == 1);
    }

    @Test
    public void buscarTest() throws Exception {
        clienteDAO = new ClienteDAO();

        Cliente cliente = new Cliente();
        cliente.setCodigo("01");
        cliente.setNome("Gilberto Paiva");
        Integer qtd = clienteDAO.cadastrar(cliente);
        assertTrue(qtd == 1);

        Cliente clienteBD = clienteDAO.buscar("01");
        assertNotNull(clienteBD);
        assertEquals(cliente.getCodigo(), clienteBD.getCodigo());
        assertEquals(cliente.getNome(), clienteBD.getNome());

        Integer qtdDel = clienteDAO.excluir(clienteBD);
        assertTrue(qtdDel == 1);
    }

    @Test
    public void excluirTest() throws Exception{
        clienteDAO = new ClienteDAO();

        Cliente cliente = new Cliente();
        cliente.setCodigo("01");
        cliente.setNome("Gilberto Paiva");
        Integer qtd = clienteDAO.cadastrar(cliente);
        assertTrue(qtd == 1);

        Cliente clienteBD = clienteDAO.buscar("01");
        assertNotNull(clienteBD);
        assertEquals(cliente.getCodigo(), clienteBD.getCodigo());
        assertEquals(cliente.getNome(), clienteBD.getNome());

        Integer qtdDel = clienteDAO.cadastrar(cliente);
        assertTrue(qtdDel == 1);
    }

    @Test
    public void buscarTodosTest() throws Exception{
        clienteDAO = new ClienteDAO();

        Cliente cliente = new Cliente();
        cliente.setCodigo("01");
        cliente.setNome("Gilberto Paiva");
        Integer qtd = clienteDAO.cadastrar(cliente);
        assertTrue(qtd == 1);

        Cliente clientes = new Cliente();
        clientes.setCodigo("02");
        clientes.setNome("Test");
        Integer qtd2 = clienteDAO.cadastrar(clientes);
        assertTrue(qtd2 == 1);

        List<Cliente> list = clienteDAO.buscarTodos();
        assertNotNull(list);
        assertEquals(2, list.size());

        int qtdDel = 0;
        for (Cliente cli : list){
            clienteDAO.excluir(cli);
            qtdDel++;
        }
        assertEquals(list.size(), qtdDel);

        list = clienteDAO.buscarTodos();
        assertEquals(list.size(), 0);
    }

    @Test
    public void atualizarTest() throws Exception{
        clienteDAO = new ClienteDAO();

        Cliente cliente = new Cliente();
        cliente.setCodigo("01");
        cliente.setNome("Gilberto Paiva");
        Integer qtd = clienteDAO.cadastrar(cliente);
        assertTrue(qtd == 1);

        Cliente clienteBD = clienteDAO.buscar("01");
        assertNotNull(clienteBD);
        assertEquals(cliente.getCodigo(), clienteBD.getCodigo());
        assertEquals(cliente.getNome(), clienteBD.getNome());

        clienteBD.setCodigo("02");
        clienteBD.setNome("Pedro Pires");
        Integer qtdUpdate = clienteDAO.atualizar(clienteBD);
        assertTrue(qtdUpdate == 1);

        Cliente clienteBD1 = clienteDAO.buscar("01");
        assertNotNull(qtdUpdate);

        Cliente clienteBD2 = clienteDAO.buscar("02");
        assertNotNull(clienteBD2);
        assertEquals(clienteBD.getId(), clienteBD2.getId());
        assertEquals(clienteBD.getCodigo(), clienteBD2.getCodigo());
        assertEquals(clienteBD.getNome(), clienteBD2.getNome());

        List<Cliente> list = clienteDAO. buscarTodos();
        for (Cliente cli : list){
            clienteDAO.excluir(cli);
        }
    }
}