package desafios.conversao;

public class DesafioTemperatura {

    public static void main(String[] args) {
        final double ADJUST = 32;
        final double DIVISOR_1 = 5.0;
        final double DIVISOR_2 = 9.0;

        double fahrenheit;
        double celsius;

        fahrenheit = 86.0;
        celsius = (fahrenheit - ADJUST ) * (DIVISOR_1 / DIVISOR_2);
        System.out.println(String.format("%.2f fahrenheit será equivalente a %.2f celsius", fahrenheit, celsius));

        celsius = 30.0;
        fahrenheit = celsius * (DIVISOR_2 / DIVISOR_1) + ADJUST;
        System.out.println(String.format("%.2f celsius será equivalente a %.2f fahrenheit", celsius, fahrenheit));
    }
}

