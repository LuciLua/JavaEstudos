package materias;

import model.mat;

public class Materias{

    public static void main(String[] args){

        mat materia1 = new mat();
        mat materia2 = new mat();
        mat materia3 = new mat();
        mat materia4 = new mat();
        mat materia5 = new mat();
        mat materia6 = new mat();
        mat materia7 = new mat();
        mat materia8 = new mat();


        // Array

        String[] Dep = new String[] { 
            "Historia",
            "Artes",
            "Sociais",
            "Letras"
        };
 
        // Array

        materia1.setNome("Metodologia da Pesquisa \n");
        materia1.setCreditos(4);

        materia2.setNome("Ilustracao \n");
        materia2.setCreditos(3);
        
        materia3.setNome("Artes e Historia III \n");
        materia3.setCreditos(4);
        
        materia4.setNome("Análise Fílmica: Metodologia e prática \n");
        materia4.setCreditos(4);
        
        materia5.setNome("Prática de Gêneros Acadêmicos \n");
        materia5.setCreditos(4);

        materia6.setNome("História da África \n");
        materia6.setCreditos(4);

        materia7.setNome("Introducao a antropologia \n");
        materia7.setCreditos(4);

        materia8.setNome("Vida urbana, globalizacao e mudanca social \n");
        materia8.setCreditos(4);

        // imprimindo...

        System.out.println("----------\n" + "Nome da Matéria: " + materia1.getNome() + materia1.getCreditos() + "\n" + "Departamento: " + Dep[1] + "\n----------");
        
        System.out.println("Nome da Matéria: " + materia2.getNome() + "Créditos: " + materia2.getCreditos() + "\n" + "Departamento: " + Dep[1] +"\n----------");
        
        System.out.println("Nome da Matéria: " + materia3.getNome() + "Créditos: " + materia3.getCreditos() + "\n" + "Departamento: " + Dep[1] + "\n----------");
        
        System.out.println("Nome da Matéria: " + materia4.getNome() + "Créditos: " + materia4.getCreditos() + "\n" + "Departamento: " + Dep[1] + "\n----------");
        
        System.out.println("Nome da Matéria: " + materia5.getNome() + "Créditos: " + materia5.getCreditos() + "\n" + "Departamento: " + Dep[3] + "\n----------");
        
        System.out.println("Nome da Matéria: " + materia6.getNome() + "Créditos: " + materia6.getCreditos() + "\n" + "Departamento: " + Dep[0] + "\n----------");
        
        System.out.println("Nome da Matéria: " + materia7.getNome() + "Créditos: " + materia7.getCreditos() + "\n" + "Departamento: " + Dep[2] + "\n----------");
        
        System.out.println("Nome da Matéria: " + materia8.getNome() + "Créditos: " + materia8.getCreditos() + "\n" + "Departamento: " + Dep[2] + "\n----------");

    }
}