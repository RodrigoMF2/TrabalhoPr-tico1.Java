import java.util.ArrayList;

public class Mudar13 {
    String texto;

    ArrayList<String>caracter = new ArrayList<>();
    String incripTexto = "";

    public String rodarTexto(String texto){
        int aux2;
        for (int i=0; i <texto.length(); i++){
            char aux = texto.charAt(i);
            for (int j=0; j<1;j++){
                if ((int)aux<65 || (int)aux>90)
                    caracter.add(String.valueOf(aux));

                else if ((int)aux<=77) {
                    aux2=(int)aux+13;
                    aux = (char)aux2;
                    caracter.add(String.valueOf((char)aux2));
                }
                else {
                    aux2=(int)aux-13;
                    aux = (char)aux2;
                    caracter.add(String.valueOf((char)aux2));
                }
            }
        }
        for (String s : caracter) {
            incripTexto = incripTexto + String.valueOf(s);
        }
        return incripTexto;
    }
    public Mudar13(String texto){this.texto = texto;}
}
