import java.util.Scanner;

public class Bissexto2 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        int A = input.nextInt();

        if (A % 400 == 0) {
            System.out.println("ANO BISSEXTO");
        } else if (A % 4 == 0 && A % 100 !=0) {
            System.out.println("ANO BISSEXTO");
        }
    }

}
