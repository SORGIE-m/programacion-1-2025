import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
        String input= JOptionPane.showInputDialog(null, "Ingrese el número que desea multiplicar:");
        int numero = Integer.parseInt(input);
        hacerTablaMulti(numero, input);

    }

    public static void hacerTablaMulti(int numero, String input){
        int i=1;
        for(i=1; i<=10; i++){
            int resultado=(numero*i);
            JOptionPane.showMessageDialog(null,input +"x"+ i + "="+ resultado+"\n");

        }
    }
}