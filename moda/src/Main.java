import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        DeterminarModa determinarModa = new DeterminarModa();
        boolean continuar = true;

        while (continuar) {
            String input = JOptionPane.showInputDialog("Ingrese un número (o cancelar para terminar):");
            if (input == null) {
                break;
            }
                int numero = Integer.parseInt(input);
                determinarModa.getNumeros().add(new Numero(numero));

        }

        int moda = determinarModa.obtenerNumeroModa();
        if (moda == Integer.MIN_VALUE) {
            JOptionPane.showMessageDialog(null, "No hay un número que se repita más que otro.");
        } else {
            JOptionPane.showMessageDialog(null, "El número que más se repite es: " + moda);
        }
    }
}