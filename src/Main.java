public class Main {
    public static void main (String[] args) {
        System.out.println("esse é o Screen Match ");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLacamento = 2022;

        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        double media = (9.8 + 6.3 +8.0) / 3;
        System.out.println(media);
        String sinopse = """
                Filme Tpo Gun
                Filme de aventura
                Ano de lançamento
                """ + anoDeLacamento;
        System.out.println(sinopse);

        int classificacao = (int) (media / 2);
        System.out.println(classificacao);

        

    }
}