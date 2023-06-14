import java.util.Scanner;

public class IdadeMaisVelho {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int A, B;

        A = input.nextInt();
        B = input.nextInt();

        if (A > B) {
            System.out.println(A);
        } else {
            System.out.println(B);
        }
    }
}
