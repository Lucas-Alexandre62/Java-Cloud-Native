public class Operadores {
    public static void main(String[] args){

        // Operadores Aritméticos
        int soma = 1 + 1; // operador de soma
        int subtracao = 1 - 1; // operador de subtração
        int multiplicacao = 1 * 1; // operador de multiplicação
        int divisao = 1 / 1; // operador de divisão
        int modulo = 1 % 1; // operador de módulo ( resto da divisão )

        // Operadores Unários
        int numero = 1;
        numero++;       // operador de incremento
        
        int numero2 = 1;
        numero--;       // operador de decremento

        boolean bool = true;
        bool = !bool;   // operador de negação

        // Operadores Ternários
        String resultado = (1 > 2) ? "Verdadeiro" : "Falso"; // operador ternário
        System.out.println(resultado);

        // Operadores Relacionais
        int a = 1; int b = 2;
        boolean igual = a == b; // operador de igualdade
        boolean diferente = a != b; // operador de diferença
        boolean maior = a > b; // operador de maior que
        boolean menor = a < b; // operador de menor que
        boolean maiorIgual = a >= b; // operador de maior ou igual
        boolean menorIgual = a <= b; // operador de menor ou igual

        // Operadores Lógicos
        boolean and = true && false; // operador AND
        boolean or = true || false; // operador OR
    }
}
