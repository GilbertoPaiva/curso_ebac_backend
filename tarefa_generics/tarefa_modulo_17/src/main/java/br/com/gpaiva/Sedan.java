package br.com.gpaiva;

public class Sedan extends Carro{
    private int capacidadePortaMalas;

    public Sedan(String marca, String modelo, int ano, int capacidadePortaMalas) {
        super(marca, modelo, ano);
        this.capacidadePortaMalas = capacidadePortaMalas;
    }

    public int getCapacidadePortaMalas(){
        return capacidadePortaMalas;
    }

    public void setCapacidadePortaMalas(int capacidadePortaMalas){
        this.capacidadePortaMalas = capacidadePortaMalas;
    }

    @Override
    public String exibirDetalhes() {
        return "Sedan [Marca: " + getMarca() + ", Modelo: " + getModelo() + ", Ano: " + getAno() + ", Capacidade do Porta-malas: " + capacidadePortaMalas + " litros]";
    }

}
