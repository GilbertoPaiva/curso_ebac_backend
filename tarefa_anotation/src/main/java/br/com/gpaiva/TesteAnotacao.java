package br.com.gpaiva;

public class TesteAnotacao {
    public static void main(String[] args) {

        Class<MinhaClasse> minhaClasse = MinhaClasse.class;

        if (minhaClasse.isAnnotationPresent(Tabela.class)){
            Tabela tabela = minhaClasse.getAnnotation(Tabela.class);

            System.out.println("Nome da tabela: " + tabela.nome());
        }else {
            System.out.println("A classe não está anotada com @Tabela.");
        }
    }
}
