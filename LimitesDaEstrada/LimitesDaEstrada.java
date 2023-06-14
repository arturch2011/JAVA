import java.util.Scanner;

public class LimitesDaEstrada {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int pesoMaximo = input.nextInt();
        double alturaMaxima = input.nextDouble();

        int pesoVeiculo = input.nextInt();
        double alturaVeiculo = input.nextDouble();

        if (pesoVeiculo > pesoMaximo || alturaVeiculo > alturaMaxima) {
            System.out.println("IMPEDIDO");
        }


    }
}
