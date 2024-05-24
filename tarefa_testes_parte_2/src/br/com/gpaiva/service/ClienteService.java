package br.com.gpaiva.service;

import br.com.gpaiva.dao.IClienteDao;

public class ClienteService {

    private IClienteDao clienteDao;

    public ClienteService(IClienteDao clienteDao) {
        this.clienteDao = clienteDao;
    }

    public String salvar() {
        clienteDao.salvar();
        return "Sucesso";
    }

    public String excluir(){
        clienteDao.excluir();
        return "Sucesso";
    }

    public String atualizar() {
        return "Sucesso";
    }

    public String buscar() {
        return "Sucesso";
    }
}
