package interfacesFuncionais;
import java.util.function.Function;


public class FunctionExemplo {
    public static void main(String[] args) {
        int numero = 2;

        Function<Integer, Integer> dobrar = num -> num * 2;
        System.out.println(dobrar.apply(numero));

        Function<Integer, Double> cast = num -> (double) num;
        System.out.println(cast.apply(numero));
    }
}
