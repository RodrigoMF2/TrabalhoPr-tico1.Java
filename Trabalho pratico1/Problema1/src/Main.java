import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static double distanciaDePontos(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double[]> pontos = new ArrayList<>();
        while (true) {
            System.out.print("Digite as coordenadas x e y separadas por espaço (ou digite 'fim' para encerrar): ");
            String input = scanner.nextLine();
            if (input.equals("fim")) {
                break;
            }
            String[] coordenadas = input.split(" ");
            Double[] ponto = {Double.parseDouble(coordenadas[0]), Double.parseDouble(coordenadas[1])};
            pontos.add(ponto);
        }
        System.out.println("Distâncias entre pontos consecutivos:");
        for (int i = 0; i < pontos.size() - 1; i++) {
            Double[] ponto1 = pontos.get(i);
            Double[] ponto2 = pontos.get(i + 1);
            double distancia = distanciaDePontos(ponto1[0], ponto1[1], ponto2[0], ponto2[1]);
            System.out.println("Distância entre ponto " + (i + 1) + " e ponto " + (i + 2) + ": " + distancia);
        }
    }
}


