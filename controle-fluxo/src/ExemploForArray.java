public class ExemploForArray {
    public static void main(String[] args) {
        String[] alunos = {"João", "Maria", "José", "Pedro", "Ana"};

        for (int i = 0; i < alunos.length; i++) {
            System.out.println("O aluno indice "+ i + " é " + alunos[i]);
        }
        // ou
        for (String aluno : alunos){
            System.out.println("O aluno é " + aluno);
        }
    }
}
