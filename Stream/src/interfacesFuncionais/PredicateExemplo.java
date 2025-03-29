package interfacesFuncionais;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;


public class PredicateExemplo {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int num = 2;

        Predicate<Integer> ehPar = numero -> numero % 2 == 0;
        System.out.println(ehPar.test(num));

        List<Integer> numerosPares = numeros.stream()
                .filter(ehPar)
                .toList();

        System.out.println(numerosPares);
        numerosPares.forEach(System.out::println);
    }
}
