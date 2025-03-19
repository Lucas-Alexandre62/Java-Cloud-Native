public class SistemaMedida {
    public static void main(String[] args) {
        String sigla = "M";

        switch(sigla){
            case "G":
                System.out.println("Grande");
                break;
            case "M":
                System.out.println("Médio");
                break;
            case "P":
                System.out.println("Pequeno");
                break;
            default:
                System.out.println("Sigla inválida");
                break;
        }
    }
}
