import java.util.Scanner;

public class SalarioComissionado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float salario, vendasT, comissao, valorC, salarioL;

        salario = scanner.nextFloat();
        vendasT = scanner.nextFloat();
        comissao = scanner.nextFloat();


        valorC = (vendasT * comissao)/100f;

        salarioL = salario + valorC;

        System.out.printf("%.2f\n", salarioL);

    }
}
