package tarefaPadroesDeProjeto1;

public class CarroLuxo implements ICarro{
    private String modelo;
    private String cor;
    private int ano;

    public CarroLuxo(String modelo, String cor, int ano) {
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
    }

    @Override
    public String getModelo() {
        return modelo;
    }

    @Override
    public String getCor() {
        return cor;
    }

    @Override
    public int getAno() {
        return ano;
    }
}
