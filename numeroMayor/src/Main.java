import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Determinacion determinacion = new Determinacion();

        for (int i = 1; i <= 3; i++) {
            boolean numeroValido = false;
            while (!numeroValido) {
                String input = JOptionPane.showInputDialog("Ingrese el " + i + "° número:");
                    int numero = Integer.parseInt(input);
                    determinacion.agregarNumero(numero);
                    numeroValido = true;
            }
        }

        JOptionPane.showMessageDialog(null, determinacion.identificarMayor());
    }
}

