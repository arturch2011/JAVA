import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int anoAtual = scanner.nextInt();
        String nome = scanner.next();
        int anoNas = scanner.nextInt();

        int idade = anoAtual - anoNas;

        System.out.println(nome + ", voce completa " + idade + " anos de idade neste ano.");

        scanner.close();
    }
}
