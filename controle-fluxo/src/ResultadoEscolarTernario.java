public class ResultadoEscolarTernario {
    public static void main(String[] args) throws Exception {
        int nota = 6;

        String resultado = nota >= 6 ? "Aprovado" : nota >= 4 && nota <= 6 ? "Recuperação" : "Reprovado";

        System.out.println(resultado);
    }
}
