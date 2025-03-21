package Encapsulamento;

public class Carro {
    
    // so podem ser acessados por metodos da propria classe
    private String nome;
    private String marca;
    private int ano;

    public String getNome() {
        return nome;
    }

    public String getMarca(){
        return marca;
    }

    public int getAno(){
        return ano;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

}

