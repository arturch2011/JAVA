import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float valorHora, desconto, salarioB, vDesconto, salarioL;
        int hora;

        valorHora = scanner.nextFloat();
        hora = scanner.nextInt();
        desconto = scanner.nextFloat();

        salarioB = valorHora * hora;

        vDesconto = (salarioB * desconto)/100f;

        salarioL = salarioB - vDesconto;

        System.out.printf("%.2f\n", salarioL);

    }
}
