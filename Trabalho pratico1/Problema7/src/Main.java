import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        String word = JOptionPane.showInputDialog(null, "Digite uma palavra: ");
        String combination = JOptionPane.showInputDialog(null, "Digite uma combinaçao de caracteres: ");

        boolean containsAllChars = true;
        int lastIndex = -1;
        for (char c:word.toCharArray()){
            int index = combination.indexOf(c,lastIndex +1);
            if (index ==-1){
                containsAllChars = false;
                break;
            }
            lastIndex = index;
        }

        String result = containsAllChars ? "yes" : "no";
        JOptionPane.showMessageDialog(null, "os caracteres da palavra " + word + " estao contidos na combinaçao " + combination + " ? " + result );
    }
}