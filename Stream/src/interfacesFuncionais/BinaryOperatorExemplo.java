package interfacesFuncionais;
import java.util.function.BinaryOperator;


public class BinaryOperatorExemplo {
    public static void main(String[] args) {
        BinaryOperator<Integer> multiplicacao = (a, b) -> a * b;

        System.out.println(multiplicacao.apply(2, 5));

    }
}
