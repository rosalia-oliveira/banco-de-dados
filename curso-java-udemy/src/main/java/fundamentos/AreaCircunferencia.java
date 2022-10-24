package fundamentos;

public class AreaCircunferencia {

    public static void main(String[] args) {
        double raio = 3.4;
        final double PI = 3.14159;

        double _raio= Math.pow(raio, 2);
        System.out.println("Área: " + PI * _raio);
    }
}
