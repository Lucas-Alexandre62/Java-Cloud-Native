public class Main {

    public static void main(String[] args) {
        Cliente venilton = new Cliente();
        venilton.setNome("Venilton");

        Conta cc = new ContaCorrente(venilton);
        Conta poupanca = new ContaPoupanca(venilton);

        cc.depositar(200);
        cc.transferir(100, poupanca);
        cc.emprestimo(200);
        cc.imprimirExtrato();
        poupanca.emprestimo(100);
        poupanca.imprimirExtrato();
    }

}