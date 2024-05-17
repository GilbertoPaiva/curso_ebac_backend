package br.com.gpaiva;

public class Main {
    public static void main(String[] args) {
        ListaDeCarros<Carro> listaDeCarros = new ListaDeCarros<>();

        Sedan sedan = new Sedan("Toyota", "Corolla", 2020, 470);
        SUV suv = new SUV("Jeep", "Compass", 2021, true);

        listaDeCarros.adicionar(sedan);
        listaDeCarros.adicionar(suv);

        listaDeCarros.listar();

    }
}