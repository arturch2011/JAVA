import java.util.Scanner;

public class Universidade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String university = scanner.next();
        int years = scanner.nextInt();

        System.out.println("Voce estuda na " + university + " ha " + years + " anos.");

        scanner.close();
    }
}
