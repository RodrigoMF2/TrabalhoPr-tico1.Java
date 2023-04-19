import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main{

    public static void main(String[] args) {
        // Abrir e ler os arquivos de texto
        ArrayList<Double> compras = lerComprasDoArquivo("compras.txt");
        ArrayList<String> clientes = lerClientesDoArquivo("clientes.txt");


        String nomeMelhorCliente = nameOfBestCustomer(compras, clientes);
            System.out.println("O melhor cliente do dia é: " + nomeMelhorCliente);
    }

    private static ArrayList<Double> lerComprasDoArquivo(String arquivo) {
        ArrayList<Double> compras = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(arquivo));
            String linha;
            while ((linha = reader.readLine()) != null) {
                double compra = Double.parseDouble(linha);
                compras.add(compra);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao ler o arquivo de compras: " + e.getMessage());
        }
        return compras;
    }

    private static ArrayList<String> lerClientesDoArquivo(String arquivo) {
        ArrayList<String> clientes = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(arquivo));
            String linha;
            while ((linha = reader.readLine()) != null) {
                clientes.add(linha);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao ler o arquivo de clientes: " + e.getMessage());
        }
        return clientes;
    }

    private static String nameOfBestCustomer(ArrayList<Double> compras, ArrayList<String> clientes) {
        String nomeMelhorCliente = "";
        double maiorCompra = 0.0;

        // Encontrar a maior compra
        for (int i = 0; i < compras.size(); i++) {
            double compra = compras.get(i);
            if (compra > maiorCompra) {
                maiorCompra = compra;
                nomeMelhorCliente = clientes.get(i);
            }
        }

        return nomeMelhorCliente;
    }
}

