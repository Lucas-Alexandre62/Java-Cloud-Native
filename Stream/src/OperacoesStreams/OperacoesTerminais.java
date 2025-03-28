package OperacoesStreams;
import java.util.*;
import java.util.stream.*;

public class OperacoesTerminais {
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("Ana", "João", "Maria", "Pedro", "Ana");

        System.out.println("\n--- Operações Terminais ---");

        // 1. forEach() - Executa ação para cada elemento
        System.out.print("forEach(): ");
        nomes.stream().forEach(n -> System.out.print(n + " ")); // Ana João Maria Pedro Ana

        // 2. collect() - Transforma em coleção (List, Set, Map)
        Set<String> setNomes = nomes.stream().collect(Collectors.toSet());
        System.out.println("\ncollect(): " + setNomes); // [Ana, João, Maria, Pedro]

        // 3. toArray() - Converte para array
        String[] arrayNomes = nomes.stream().toArray(String[]::new);
        System.out.println("toArray(): " + Arrays.toString(arrayNomes)); // [Ana, João, Maria, Pedro, Ana]

        // 4. reduce() - Reduz a um único valor (soma, concatenação, etc.)
        Optional<String> concatenado = nomes.stream().reduce((s1, s2) -> s1 + ", " + s2);
        System.out.println("reduce(): " + concatenado.get()); // Ana, João, Maria, Pedro, Ana

        // 5. count() - Conta elementos
        long quantidade = nomes.stream().count();
        System.out.println("count(): " + quantidade); // 5

        // 6. min() / max() - Encontra menor/maior elemento (usa Comparator)
        Optional<String> menorNome = nomes.stream().min(Comparator.naturalOrder());
        System.out.println("min(): " + menorNome.get()); // Ana

        // 7. anyMatch() / allMatch() / noneMatch() - Testa condições
        boolean temMaria = nomes.stream().anyMatch(n -> n.equals("Maria"));
        System.out.println("anyMatch(): " + temMaria); // true

        boolean todosTemA = nomes.stream().allMatch(n -> n.contains("a"));
        System.out.println("allMatch(): " + todosTemA); // false

        boolean nenhumTemZ = nomes.stream().noneMatch(n -> n.contains("Z"));
        System.out.println("noneMatch(): " + nenhumTemZ); // true

        // 8. findFirst() / findAny() - Retorna o primeiro/qualquer elemento
        Optional<String> primeiro = nomes.stream().findFirst();
        System.out.println("findFirst(): " + primeiro.get()); // Ana

        Optional<String> qualquer = nomes.parallelStream().findAny();
        System.out.println("findAny(): " + qualquer.get()); // Qualquer nome (em paralelo)
    }
}
