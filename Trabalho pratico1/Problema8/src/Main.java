import java.util.Random;

public class Main {
    public static void main(String[] args) {

        double resistencialNominal = 330;
        double tolerancia = 0.1;
        double valorMinimo = resistencialNominal *(1-tolerancia);
        double valorMaximo = resistencialNominal *(1+tolerancia);
        Random random = new Random();

        System.out.println("Valores de resistencia real para 10 resistencias de 330 OHMS +/- 10%: ");
        for (int i = 0; i < 10; i++) {
            double valor = valorMinimo + (valorMaximo - valorMinimo) * random.nextDouble();
            System.out.println("Resistencia real: " + valor + " Ohms");
        }
    }
}