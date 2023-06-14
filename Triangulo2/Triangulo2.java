import java.util.Scanner;

public class Triangulo2 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        float A, B, C;

        A = input.nextFloat();
        B = input.nextFloat();
        C = 180-(A + B);

        if (A > 90 || B > 90 || C > 90) {
            System.out.println("obtusangulo");
        } else if (A == 90 || B == 90 || C == 90) {
            System.out.println("retangulo");
        } else {
            System.out.println("acutangulo");
        }
    }
}
