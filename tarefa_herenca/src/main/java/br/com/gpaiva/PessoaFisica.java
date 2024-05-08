package br.com.gpaiva;

public class PessoaFisica extends Pessoa{
    private String cpf;

    public PessoaFisica(String nome, String cpf) {
        super(nome);
        this.cpf = cpf;
    }

    @Override
    public String obterDocumento() {
        return "cpf";
    }
}
