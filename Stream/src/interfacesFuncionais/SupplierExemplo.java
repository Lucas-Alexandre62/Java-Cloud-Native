package interfacesFuncionais;
import java.util.function.Supplier;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Stream;

public class SupplierExemplo {
    public static void main(String[] args) {
        Supplier<String> saudacao = () -> "Ola, como voce esta?";
        System.out.println(saudacao.get());

        Supplier<Double> numeroAleatorio =  Math::random;
        System.out.println(numeroAleatorio.get());

        List<String> saudacoes = Stream.generate(saudacao)
                .limit(5)
                .toList();

        System.out.println(saudacoes);
        saudacoes.forEach(System.out::println);
    }
;
}
