package br.com.gpaiva;

import br.com.gpaiva.dao.*;
import br.com.gpaiva.domain.Carro;
import br.com.gpaiva.domain.Marca;
import br.com.gpaiva.domain.Acessorio;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class CarroTest {

    private ICarroDao carroDao;
    private IMarcaDao marcaDao;
    private IAcessorioDao acessorioDao;

    public CarroTest() {
        carroDao = new CarroDao();
        marcaDao = new MarcaDao();
        acessorioDao = new AcessorioDao();
    }

    @Test
    public void cadastrar() {
        Marca marca = criarMarca("M1");
        assertNotNull(marca.getCodigo());

        Acessorio acessorio1 = criarAcessorio("A1", "Acessorio A1");
        Acessorio acessorio2 = criarAcessorio("A2", "Acessorio A2");

        Carro carro = new Carro();
        carro.setCodigo("C1");
        carro.setModelo("Modelo Teste");
        carro.setMarca(marca);
        carro.addAcessorio(acessorio1);
        carro.addAcessorio(acessorio2);

        carro = carroDao.cadastrar(carro);

        assertNotNull(carro);
        assertNotNull(carro.getId());

        Carro carroBD = carroDao.buscarPorCodigoMarca(marca.getCodigo());
        assertNotNull(carroBD);
        assertEquals(carro.getId(), carroBD.getId());

        Carro carroBDObj = carroDao.buscarPorMarca(marca);
        assertNotNull(carroBDObj);
        assertEquals(carro.getId(), carroBDObj.getId());
    }


    private Marca criarMarca(String codigo) {
        Marca marca = new Marca();
        marca.setCodigo(codigo);
        marca.setNome("Marca Teste");
        return marcaDao.cadastrar(marca);
    }



    private Acessorio criarAcessorio(String codigo, String nome) {
        Acessorio acessorio = new Acessorio();
        acessorio.setCodigo(codigo);
        acessorio.setNome(nome);
        acessorio.setDescricao("Acessorio Teste");
        return acessorioDao.cadastrar(acessorio);
    }
}
