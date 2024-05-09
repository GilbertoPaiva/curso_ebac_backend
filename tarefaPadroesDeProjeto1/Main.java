package tarefaPadroesDeProjeto1;

public class Main {
    public static void main(String[] args) {
        FabricaDeCarros fabricaDeCarrosPopulares = new FabricaDeCarrosPopulares();
        ICarro carroPopular = fabricaDeCarrosPopulares.crairCarro();

        System.out.println("Carro Popular:");
        System.out.println("Modelo: " + carroPopular.getModelo());
        System.out.println("Cor: " + carroPopular.getCor());
        System.out.println("Ano: " + carroPopular.getAno());

        FabricaDeCarros fabricaDeCarrosLuxo = new FabricaDeCarrosDeLuxo();
        ICarro carroLuxo = fabricaDeCarrosLuxo.crairCarro();

        System.out.println("\nCarro Luxo:");
        System.out.println("Modelo: " + carroLuxo.getModelo());
        System.out.println("Cor: " + carroLuxo.getCor());
        System.out.println("Ano: " + carroLuxo.getAno());
    }
}
