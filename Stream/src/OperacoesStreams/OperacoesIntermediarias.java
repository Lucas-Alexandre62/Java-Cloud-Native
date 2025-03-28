package OperacoesStreams;
import java.util.Arrays;
import java.util.List;

public class OperacoesIntermediarias {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.println("--- Operações Intermediárias ---");

        // 1. filter() - Filtra elementos
        System.out.println("filter(): " + numeros.stream().filter(n -> n % 2 == 0).toList()); // [2, 4, 6, 8, 10]

        // 2. map() - Transforma cada elemento
        System.out.println("map(): " + numeros.stream().map(n -> n * 2).toList()); // [2, 4, 6, 8, 10, 12, 14, 16, 18, 20]

        // 3. flatMap() - Achata streams aninhados
        List<List<Integer>> listaDeListas = Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 4));
        System.out.println("flatMap(): " + listaDeListas.stream().flatMap(List::stream).toList()); // [1, 2, 3, 4]

        // 4. distinct() - Remove duplicados
        List<Integer> comRepetidos = Arrays.asList(1, 2, 2, 3, 3, 3);
        System.out.println("distinct(): " + comRepetidos.stream().distinct().toList()); // [1, 2, 3]

        // 5. sorted() - Ordena elementos
        List<Integer> desordenados = Arrays.asList(5, 3, 8, 1);
        System.out.println("sorted(): " + desordenados.stream().sorted().toList()); // [1, 3, 5, 8]

        // 6. peek() - Permite inspecionar elementos (útil para debug)
        System.out.print("peek(): ");
        numeros.stream().peek(n -> System.out.print(n + " ")).toList(); // 1 2 3 4 5 6 7 8 9 10

        // 7. limit() - Limita a quantidade de elementos
        System.out.println("\nlimit(): " + numeros.stream().limit(3).toList()); // [1, 2, 3]

        // 8. skip() - Pula os primeiros N elementos
        System.out.println("skip(): " + numeros.stream().skip(5).toList()); // [6, 7, 8, 9, 10]
    }
}
