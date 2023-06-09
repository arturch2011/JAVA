import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numA = scanner.nextInt();
        int numB = scanner.nextInt();

        int soma = numA + numB;

        System.out.println(soma);

        scanner.close();
    }
}
