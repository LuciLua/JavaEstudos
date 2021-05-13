package JavaTwo.model;

public class mat{
    
    private String Nome;
    private int Creditos;

    public mat(){

    }

    public mat (String Nome, int Creditos){
        
        this.Nome = Nome;
        this.Creditos = Creditos;
    }

    public String getNome(){
        return Nome;
    }

    public void setNome(String Nome){
        this.Nome = Nome;
    }
    
    public int getCreditos(){
        return Creditos;
    }
    
    public void setCreditos(int Creditos){
        this.Creditos = Creditos;
    }
    
}