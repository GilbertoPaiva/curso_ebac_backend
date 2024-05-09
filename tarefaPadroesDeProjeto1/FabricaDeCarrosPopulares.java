package tarefaPadroesDeProjeto1;

public class FabricaDeCarrosPopulares extends FabricaDeCarros{
    @Override
    public ICarro crairCarro() {
        return new CarroPopular("Modelo Popular", "Branco", 2023);
    }
}
