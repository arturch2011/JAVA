import java.util.Scanner;

public class Hello2
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("Hello " + name + ". Welcome!");

        scanner.close();
    }
}
