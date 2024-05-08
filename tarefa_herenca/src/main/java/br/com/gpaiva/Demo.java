package br.com.gpaiva;

public class Demo {
    public static void main(String[] args) {
        PessoaFisica pessoaFisica = new PessoaFisica("João", "123.456.789-10");
        PessoaJuridica pessoaJuridica = new PessoaJuridica("Empresa ABC", "12.345.678/0001-90");

        System.out.println("Pessoa Física:");
        System.out.println("Nome :" + pessoaFisica.getNome());
        System.out.println("CPF: " + pessoaFisica.obterDocumento());

        System.out.println("\nPessoa Juridica:");
        System.out.println("Nome: " + pessoaJuridica.getNome());
        System.out.println("CNPJ: " + pessoaJuridica.obterDocumento());
    }
}
