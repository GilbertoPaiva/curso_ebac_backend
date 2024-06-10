package br.com.gpaiva.dao;

import br.com.gpaiva.domain.Carro;
import br.com.gpaiva.domain.Marca;

public interface ICarroDao {
   public Carro cadastrar(Carro carro);

   Carro buscarPorCodigoMarca(String codigo);

   Carro buscarPorMarca(Marca marca);
}
