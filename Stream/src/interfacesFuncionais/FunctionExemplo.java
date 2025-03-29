package interfacesFuncionais;
import java.util.function.Function;
import java.util.List;
import java.util.Arrays;


public class FunctionExemplo {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2 ,3, 4);
        int numero = 2;

        Function<Integer, Integer> dobrar = num -> num * 2;
        System.out.println(dobrar.apply(numero));

        Function<Integer, Double> cast = num -> (double) num;
        System.out.println(cast.apply(numero));

        List<Integer> numerosDobrados = numeros.stream()
                .map(dobrar)
                .toList();

        System.out.println(numerosDobrados);
    }
}
