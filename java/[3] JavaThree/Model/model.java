package Model;

public class model{
    private String Nome;
    private int Idade;

    private int Logado;
    
    private boolean Cadastrado;
    
    public model(){
        this.setLogado(0);   
    }

    public model(String Nome, int Idade){
        this.Nome = Nome;
        this.Idade = Idade;
    }

    public void logar(int val){
        if(Cadastrado){
            this.setLogado(this.getLogado() + val);
        }else{
            System.out.println("O usuario não está cadastrado, não pode Logar");
        }
    }


    public String getNome(){
        return Nome;
    }

    public void setNome(String Nome){
        this.Nome = Nome;
    }
    public int getIdade(){
        return Idade;
    }

    public void setIdade(int Idade){
        this.Idade = Idade;
    }

    
    public int getLogado(){
        return Logado;
    }
    
    public void setLogado(int Logado){
        this.Logado = Logado;
    }
    
    public boolean isCadastrado(){
        return Cadastrado;
    }

    public void setCadastrado(boolean Cadastrado){
        this.Cadastrado = Cadastrado;
    }
}
    
