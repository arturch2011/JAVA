import java.util.Scanner;

public class Senha {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        int S = input.nextInt();
        boolean funciona = true;

        while (S > 0){
            int num = S % 10;
            if (num == 0) {
                funciona = false;
            }
            S /= 10;
        }

        if(funciona){
            System.out.println("SIM");
        } else {
            System.out.println("NAO");
        }



    }

}
