package interfacesFuncionais;
import java.util.function.Predicate;


public class PredicateExemplo {
    public static void main(String[] args) {
        int num = 2;
        Predicate<Integer> ehPar = numero -> numero % 2 == 0;
        System.out.println(ehPar.test(num));
    }
}
