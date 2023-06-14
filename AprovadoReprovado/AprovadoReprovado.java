import java.util.Scanner;

public class AprovadoReprovado{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        float input = scanner.nextFloat();

        if(input >= 60f){
            System.out.println("APROVADO");
        } else{
            System.out.println("REPROVADO");
        }
    }
}
