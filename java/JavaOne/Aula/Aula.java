package JavaOne.Aula;

import JavaOne.model.Carro;

public class Aula {

    public static void main(String[] args){

        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        // criei uma instancia (new Carro()) usando este construtor:  carro1. sem valor pois n passei nenhum.
        

        //get retorna/imprime pra mim mesm
        // set inserir

        carro1.setAno(2017);
        carro1.setMarca("Uno");

        // Não é recomendado | sem boas praticas acessar diretamente, melhor criar get set|
        carro1.NumPorta = 4;

        carro2.setAno(2021);
        carro2.setMarca("Ferrari");

        // imprimindo...

        System.out.println(carro2.getAno() + carro2.getMarca());
        
        System.out.println(carro1.getAno() + carro1.getMarca());

        System.out.println(carro1.getNumPorta());
    }
}