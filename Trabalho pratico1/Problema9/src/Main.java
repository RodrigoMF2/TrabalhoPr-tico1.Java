import java.util.HashMap;
import java.util.Map;
public class Main {

    public static void main(String[] args) {
        Map<String, Integer> cores = new HashMap<>();
        cores.put("preto", 0);
        cores.put("marrom", 1);
        cores.put("vermelho", 2);
        cores.put("laranja", 3);
        cores.put("amarelo", 4);
        cores.put("verde", 5);
        cores.put("azul", 6);
        cores.put("violeta", 7);
        cores.put("cinza", 8);
        cores.put("branco", 9);

        //Resistor colors
        String primeiraFaixa = "vermelho";
        String segundaFaixa = "violeta";
        String terceiraFaixa = "verde";
        String quartaFaixa = "dourado";


        int primeiraFaixaValor = cores.get(primeiraFaixa);
        int segundaFaixaValor = cores.get(segundaFaixa);
        int multiplicador = (int) Math.pow(10,cores.get(terceiraFaixa));
        double tolerancia = 0.05;
        double valor = (primeiraFaixaValor * 10 + segundaFaixaValor) * multiplicador;

        System.out.println("O valor da resistencia é: " + valor/1000 + " ohms");
        System.out.println("A tolerancia é: " + tolerancia*100 + "%");


    }
}