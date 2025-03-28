package interfacesFuncionais;
import java.util.function.Supplier;

public class SupplierExemplo {
    public static void main(String[] args) {
        Supplier<String> saudacao = () -> "Ola, como voce esta?";

        System.out.println(saudacao.get());

        Supplier<Double> numeroAleatorio =  Math::random;
        System.out.println(numeroAleatorio.get());
    }
;
}
