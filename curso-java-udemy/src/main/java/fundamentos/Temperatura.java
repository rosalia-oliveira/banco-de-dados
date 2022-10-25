package fundamentos;

public class Temperatura {

    public static void main(String[] args) {
        final double ADJUST = 32;
        final double FACTOR = 5.0 / 9;
        double fahrenheit;
        double celsius;

        fahrenheit = 86.0;
        celsius = (fahrenheit - ADJUST ) * FACTOR;
        System.out.println(String.format("%.2f fahrenheit será equivalente a %.2f celsius", fahrenheit, celsius));

        fahrenheit = 150.0;
        celsius = (fahrenheit - ADJUST ) * FACTOR;
        System.out.println(String.format("%.2f fahrenheit será equivalente a %.2f celsius", fahrenheit, celsius));

        fahrenheit = 0;
        celsius = (fahrenheit - ADJUST ) * FACTOR;
        System.out.println(String.format("%.2f fahrenheit será equivalente a %.2f celsius", fahrenheit, celsius));

        fahrenheit = 32;
        celsius = (fahrenheit - ADJUST ) * FACTOR;
        System.out.println(String.format("%.2f fahrenheit será equivalente a %.2f celsius", fahrenheit, celsius));
    }
}
