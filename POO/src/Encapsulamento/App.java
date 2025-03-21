package Encapsulamento;

public class App {
    public static void main(String[] args) {
        Carro camaro = new Carro();
        camaro.setNome("Camaro");
        camaro.setMarca("Chevrolet");
        camaro.setAno(2016);

        System.out.println("Nome: " + camaro.getNome() + "\nMarca: " + camaro.getMarca() + "\nAno: " + camaro.getAno());
    
}
