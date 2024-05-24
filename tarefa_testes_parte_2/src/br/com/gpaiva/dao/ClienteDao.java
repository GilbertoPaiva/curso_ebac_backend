package br.com.gpaiva.dao;


public class ClienteDao implements IClienteDao {

    public String salvar() {
        throw new UnsupportedOperationException("Não funciona sem config de banco");
    }

    @Override
    public String excluir() {
        return null;
    }
}
