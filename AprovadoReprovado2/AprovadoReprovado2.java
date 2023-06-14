import java.util.Scanner;

public class AprovadoReprovado2{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        double nota1 = input.nextDouble();
        double nota2 = input.nextDouble();

        double media = (nota1 + nota2) / 2f;

        if (media >= 60f) {
            System.out.println("APROVADO");
        } else if (media >= 40f) {
            System.out.println("EXAME FINAL");
        } else {
            System.out.println("REPROVADO");
        }
    }
}
