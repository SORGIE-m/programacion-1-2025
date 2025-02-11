import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Ingreso ingreso = new Ingreso();

        for (int i =1; i <= 5; i++){
            String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del ingreso"+i);
            ingreso.agregarNombre(nombre);
        }

        ingreso.mostrarNombresInvertidos();

    }
}
