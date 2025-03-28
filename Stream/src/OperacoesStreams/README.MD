# Operações do Streams

1. Criação de Streams:
``` Java
// De coleção
List<String> lista = Arrays.asList("a", "b", "c");
Stream<String> stream = lista.stream();

// De array
String[] array = {"a", "b", "c"};
Stream<String> stream = Arrays.stream(array);

// Stream de valores
Stream<String> stream = Stream.of("a", "b", "c");

// Stream infinita
Stream<Integer> numeros = Stream.iterate(0, n -> n + 1);
```

2. Operações Intermediárias ( transformam a stream ):
``` Java
.filter(Predicate<T>)   // Filtra elementos
.map(Function<T,R>)     // Transforma elementos
.sorted()               // Ordena elementos
.distinct()             // Remove duplicados
.limit(long)            // Limita a quantidade
.skip(long)             // Pula N elementos
.flatmap(List)          // Achata streams aninhados
.peek()                 // Inspeciona elementos ( debug )
.limit()                // Limita a quantidade
```

3. Operações terminais ( produzem resultado ):
``` Java
.forEach(Consumer<T>)   // Executa ação para cada elemento
.count()                // Conta elementos
.collect(Collector)     // Transforma em coleção
.reduce()               // Reduz a um único valor
.min() / max()          // Encontra mínimo/máximo
.anyMatch() / allMatch() / noneMatch() // Testa predicados
.findFirst() / findAny() // Encontra elementos
.toArray()              // Converte para array 
```

Exemplo prático:
``` Java
List<String> nomes = Arrays.asList("Ana", "João", "Maria", "Pedro", "Alice");

// Filtrar nomes que começam com 'A', converter para maiúsculas e imprimir
nomes.stream()
     .filter(n -> n.startsWith("A"))
     .map(String::toUpperCase)
     .forEach(System.out::println);

// Contar nomes com mais de 3 letras
long count = nomes.stream()
                 .filter(n -> n.length() > 3)
                 .count();
```