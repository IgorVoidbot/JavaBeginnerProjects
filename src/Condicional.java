public class Condicional {
    public static void main (String[] args) {
        int anoDelancamento = 2022;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "Plus";

        if (anoDelancamento > 2022) {
            System.out.println("lançamento que os clientes estão curtindo!");
        } else {
            System.out.println("Filme retró vale a pena assistir!");
        }

        if (incluidoNoPlano == true || tipoPlano.equals("Plus")) {
            System.out.println();
        }
    }
}
