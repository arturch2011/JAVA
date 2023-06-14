import java.util.Scanner;

public class Retas {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        float A, B, C, D;

        A = input.nextFloat();
        B = input.nextFloat();
        C = input.nextFloat();
        D = input.nextFloat();

        if (A == C && B == D) {
            System.out.println("coincidentes");
        } else if (A == C) {
            System.out.println("paralelas");
        } else {
            System.out.println("concorrentes");
        }
    }
}
