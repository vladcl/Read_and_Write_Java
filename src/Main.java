
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Escreva o nome: ");
        String nome = leitor.nextLine();
        System.out.println("Escreva a idade: ");
        int idade = leitor.nextInt();
        System.out.println("Escreva a cotação do dolar: ");
        float cotacaoDolar = leitor.nextFloat();
        System.out.println("Escreva a cotação do euro: ");
        double cotacaoEuro = leitor.nextDouble();

        System.out.println("Olá, " + nome + "!");
        System.out.println(nome + " possui " + idade + " anos");
        System.out.println("A cotação do dolar hoje é: " + cotacaoDolar);
        System.out.println("A cotação do euro hoje é: " + cotacaoEuro);

    }
}