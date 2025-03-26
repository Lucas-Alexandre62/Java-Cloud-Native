// condicional composta
public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 6;

        if(nota >= 6){
            System.out.println("Aprovado");
        }

        else if(nota > 4 && nota < 6){  // condicional encadeada
            System.out.println("Recuperação");
        }

        else{
            System.out.println("Reprovado");
        }
    }
}
