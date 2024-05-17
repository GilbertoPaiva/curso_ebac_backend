package br.com.gpaiva;

public class SUV extends Carro{
    private boolean tracao4x4;

    public SUV(String marca, String modelo, int ano, boolean tracao4x4){
        super(marca, modelo, ano);
        this.tracao4x4 = tracao4x4;
    }

    public boolean isTracao4x4() {
        return tracao4x4;
    }

    public void setTracao4x4(boolean tracao4x4) {
        this.tracao4x4 = tracao4x4;
    }

    @Override
    public String exibirDetalhes() {
        return "SUV [Marca: " + getMarca() + ", Modelo: " + getModelo() + ", Ano: " + getAno() +
                ", Tração 4x4: " + (tracao4x4 ? "Sim" : "Não") + "]";
    }
}
