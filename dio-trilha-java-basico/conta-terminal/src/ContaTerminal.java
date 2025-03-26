import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int Numero;
        String Agencia;
        String NomeCliente;
        Double Saldo;

        System.out.println("Digite o número da agencia: ");
        Agencia = scanner.nextLine();

        System.out.println("Digite o número da conta: ");
        Numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o nome do cliente: ");
        NomeCliente = scanner.nextLine();

        System.out.println("Digite o saldo da conta: ");
        Saldo = scanner.nextDouble();

        System.out.println("Olá " + NomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + Agencia + " conta " + Numero + " e seu saldo de " + Saldo + " ja esta disponivel para saque");
    }
}
