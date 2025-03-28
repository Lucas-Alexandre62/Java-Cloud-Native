package interfacesFuncionais;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.List;
import java.util.ArrayList;

public class ConsumerExemplo {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Consumer<Integer> ehPar = numero -> {
            if(numero % 2 == 0){
                System.out.println("Numero " + numero + " é par");
            }
        };

        lista.forEach(ehPar);
    }
}
