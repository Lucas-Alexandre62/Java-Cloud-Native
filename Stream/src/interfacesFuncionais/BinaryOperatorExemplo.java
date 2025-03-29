package interfacesFuncionais;
import java.util.Arrays;
import java.util.function.BinaryOperator;
import java.util.List;




public class BinaryOperatorExemplo {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4);
        BinaryOperator<Integer> multiplicacao = (a, b) -> a * b;
        BinaryOperator<Integer> somar = (a, b) -> a + b;

        int resultado = numeros.stream().reduce(2, multiplicacao);
        System.out.println(resultado);

        resultado = numeros.stream().reduce(0, somar);
        System.out.println(resultado);

    }
}
