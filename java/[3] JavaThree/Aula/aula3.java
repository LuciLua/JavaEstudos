package Aula;

import Model.model;

public class aula3 {
    public static void main(String[] args){

        model user1 = new model();
        model user2 = new model();

        user1.setNome("Luci");
        user1.setIdade(19);
        user1.setLogado(0);
        
        user2.setNome("John");
        user2.setIdade(22);
        user2.setLogado(1);

        System.out.println("------User-1------");

        System.out.println("Nome: " + user1.getNome() +
        "\nIdade: " + user1.getIdade() + "\nCadastro: " + user1.getLogado());

        System.out.println("------User-2------");

        System.out.println("Nome: " + user2.getNome() +
        "\nIdade: " + user2.getIdade()+ "\nCadastro: " + user2.getLogado());

        System.out.println("----------------");
    }
}
