package Aula;

import Model.model;

public class aula3 {
    public static void main(String[] args){

        model user1 = new model();
        model user2 = new model();
        model user3 = new model();

        user1.setNome("Luci");
        user1.setIdade(19);
        // Logando sem conta
        user1.logar(20);
        
        
        user2.setNome("John");
        user2.setIdade(22);
        // Logando com conta
        user2.cadastrar();
        user2.logar(10);
        
        user3.setNome("Manu");
        user3.setIdade(30);
        // Logando com conta remove loga
        user3.cadastrar();
        user3.logar(10);
        user3.removeAccount();
        user3.logar(10);


        System.out.println("------User-1------");

        System.out.println("Nome: " + user1.getNome() +
        "\nIdade: " + user1.getIdade() + "\nCadastro: " + user1.getLogado());

        System.out.println("------User-2------");

        System.out.println("Nome: " + user2.getNome() +
        "\nIdade: " + user2.getIdade()+ "\nCadastro: " + user2.getLogado());

        System.out.println("------User-3------");

        System.out.println("Nome: " + user3.getNome() +
        "\nIdade: " + user3.getIdade()+ "\nCadastro: " + user3.getLogado());

        System.out.println("----------------");
    }
}
