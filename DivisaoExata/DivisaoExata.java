import java.util.Scanner;

public class DivisaoExata{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        long input, input1;

        input = scanner.nextLong();
        input1 = scanner.nextLong();

        if(input % input1 == 0){
            System.out.println("a divisao de " + input + " por " + input1 + " eh exata.");
        }
    }
}
