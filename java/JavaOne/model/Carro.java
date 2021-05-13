package JavaOne.model;

public class Carro{
    
    private String Marca;
    private String Modelo;
    private int Ano;

    public int NumPorta;

    private int NumLugares;
    private int Velocidade;

    private boolean Ligado;

    public Carro(){

    }

    public Carro (String Marca, String Modelo, int Ano, int NumPorta, int NumLugares){
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Ano = Ano;
        this.NumPorta = NumPorta;
        this.NumLugares = NumLugares;
    }

    public String getMarca(){
        return Marca;
    }

    public void setMarca(String Marca){
        this.Marca = Marca;
        // this significa que to referenciando a Marca inserida na classe Carro /\
    }

    public String getModelo(){
        return Modelo;
    }

    public void setModelo(String Modelo){
        this.Modelo = Modelo;
    } 

    public int getAno(){
        return Ano;
    }

    public void setAno(int Ano){
        this.Ano = Ano;
    }
    public int getNumPorta(){
        return NumPorta;
    }

    public void setNumPorta(int NumPorta){
        this.NumPorta = NumPorta;
    }

    public int getNumLugares(){
        return NumLugares;
    }
    public void setNumLugares(int NumLugares){
        this.NumLugares = NumLugares;
    }

    public int getVelocidade(){
        return Velocidade;
    }

    public void setVelocidade(int Velocidade){
        this.Velocidade = Velocidade;
    }

    public boolean isLigado(){
        return Ligado;
    }

    public void setLigado(boolean Ligado){
        this.Ligado = Ligado;
    }

}