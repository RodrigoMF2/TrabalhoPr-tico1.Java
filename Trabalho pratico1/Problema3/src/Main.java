import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] numeros = new int[10];
        Random random = new Random();

        // Inicializar array com inteiros aleatórios
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(101); // gera números inteiros aleatórios entre 0 e 100
        }

        // Escrever no arquivo de texto
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("saida.txt"));

            // Escrever todos os elementos que estão em índices pares
            for (int i = 0; i < numeros.length; i += 2) {
                writer.write("Elemento no índice par: " + numeros[i]);
                writer.newLine();
            }

            // Escrever todos os elementos pares
            for (int numero : numeros) {
                if (numero % 2 == 0) {
                    writer.write("Elemento par: " + numero);
                    writer.newLine();
                }
            }

            // Escrever todos os elementos na ordem inversa
            for (int i = numeros.length - 1; i >= 0; i--) {
                writer.write("Elemento na ordem inversa: " + numeros[i]);
                writer.newLine();
            }

            // Escrever apenas o primeiro e último elemento
            writer.write("Primeiro elemento: " + numeros[0]);
            writer.newLine();
            writer.write("Último elemento: " + numeros[numeros.length - 1]);

            writer.close();
            System.out.println("Arquivo de texto criado com sucesso!");
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao escrever no arquivo de texto: " + e.getMessage());
        }
    }
}
