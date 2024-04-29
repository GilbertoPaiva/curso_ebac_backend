public class Carro {
    // Propriedades
    private String marca;
    private String modelo;
    private int ano;
    private String cor;
    
    // Construtor
    public Carro(String marca, String modelo, int ano, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
    }
    
    // Método para ligar o carro
    public void ligar() {
        System.out.println("O carro " + marca + " " + modelo + " está ligado.");
    }
    
    // Método para desligar o carro
    public void desligar() {
        System.out.println("O carro " + marca + " " + modelo + " está desligado.");
    }
    
    // Método main para testar o objeto Carro
    public static void main(String[] args) {
        // Criando um objeto Carro
        Carro meuCarro = new Carro("Toyota", "Corolla", 2020, "Prata");
        
        // Chamando os métodos ligar() e desligar()
        meuCarro.ligar();
        meuCarro.desligar();
    }
}
