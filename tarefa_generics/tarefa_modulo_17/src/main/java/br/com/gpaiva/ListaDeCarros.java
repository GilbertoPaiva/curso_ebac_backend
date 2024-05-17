package br.com.gpaiva;
import java.util.ArrayList;
import java.util.List;

public class ListaDeCarros<T extends Carro> {
    private List<T> carros;

    public ListaDeCarros() {
        this.carros = new ArrayList<>();
    }

    public void adicionar(T carro){
        carros.add(carro);
    }

    public void remover(T carro){
        carros.remove(carro);
    }

    public void listar(){
        for(T carro : carros){
            System.out.println(carro.exibirDetalhes());
        }
    }
}
