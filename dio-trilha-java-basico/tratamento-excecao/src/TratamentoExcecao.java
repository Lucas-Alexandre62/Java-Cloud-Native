import java.util.InputMismatchException;
import java.util.Scanner;

public class TratamentoExcecao {
    public static void main(String[] args) throws Exception {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite seu nome: ");
            String nome = scanner.nextLine();

            System.out.println("Digite seu sobrenome: ");
            String sobrenome = scanner.nextLine();

            System.out.println("Digite sua idade: ");
            int idade = scanner.nextInt();

            System.out.println("Digite sua altura: ");
            double altura = scanner.nextDouble();

            System.out.println("Nome: " + nome);
        } catch (InputMismatchException e) {
            System.out.println("os campos idade e altura precisam ser numericos!");
        }
    }
}
