package desafios.conversao;

import java.util.Scanner;

public class DesafioCalculadora {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        double value1 = input.nextDouble();

        System.out.print("Digite o segundo numero: ");
        double value2 = input.nextDouble();

        System.out.print("Digite a operação: ");
        String operation = input.next();

        double result = "+".equals(operation) ? value1 + value2 : 0;
        result = "-".equals(operation) ? value1 - value2 : result;
        result = "/".equals(operation) ? value1 / value2 : result;
        result = "*".equals(operation) ? value1 * value2 : result;
        result = "%".equals(operation) ? value1 % value2 : result;

        System.out.printf("%.2f %s %.2f = %.2f", value1, operation, value2, result);

        input.close();
    }
}
