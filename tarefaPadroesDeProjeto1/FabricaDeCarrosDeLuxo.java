package tarefaPadroesDeProjeto1;

public class FabricaDeCarrosDeLuxo extends FabricaDeCarros{
    @Override
    public ICarro crairCarro() {
        return new CarroLuxo("Modelo Luxo", "Preto", 2024);
    }
}
