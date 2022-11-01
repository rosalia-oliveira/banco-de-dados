package desafios.conversao;

import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro valor de salario: ");
        Double salaryOne = Double.parseDouble(input.nextLine().replace(",", "."));

        System.out.println("Digite o segundo valor de salario: ");
        Double salaryTwo = Double.parseDouble(input.nextLine().replace(",", "."));

        System.out.println("Digite o terceiro valor de salario: ");
        Double salaryThree = Double.parseDouble(input.nextLine().replace(",", "."));

       Double average = (salaryOne + salaryTwo + salaryThree) / 3;

        System.out.println("Média Salarial: " + average);

        input.close();

    }
}


