//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import javax.swing.*;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Guarderia guarderia = new Guarderia("Pequeños Gigantes");

        while (true) {
            String opcion = JOptionPane.showInputDialog(
                    "1. Agregar niño\n" +
                            "2. Mostrar niños mayores de 5 años\n" +
                            "3. Mostrar todos los niños\n" +
                            "4. Salir\n" +
                            "Seleccione una opción:");

            if (opcion == null || opcion.equals("3")) {
                break;
            }

            switch (opcion) {
                case "1":
                    String idStr = JOptionPane.showInputDialog("Ingrese el número de documento del niño:");
                    int id = Integer.parseInt(idStr);

                    if (guarderia.existeNiñoConId(id)) {
                        JOptionPane.showMessageDialog(null, "El número de documento ya existe. Intente con otro.");
                        continue;
                    }

                    String nombre = JOptionPane.showInputDialog("Ingrese el nombre del niño:");
                    String edad = JOptionPane.showInputDialog("Ingrese la edad del niño:");
                    String genero = JOptionPane.showInputDialog("Ingrese el género del niño:");
                    String alergias = JOptionPane.showInputDialog("Ingrese las alergias del niño:");
                    String nombreAcu = JOptionPane.showInputDialog("Ingrese el nombre del acudiente:");
                    String numeroAcu = JOptionPane.showInputDialog("Ingrese el número del acudiente:");

                    Niño nuevoNiño = new Niño(nombre, edad, genero, id, alergias, nombreAcu, numeroAcu);
                    guarderia.agregarNiño(nuevoNiño);
                    JOptionPane.showMessageDialog(null, "Niño agregado correctamente.");
                    break;

                case "2":
                    String listaMayores5 = guarderia.listarNiñosMayoresDe5();
                    if (listaMayores5.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "No hay niños mayores de 5 años.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Niños mayores de 5 años:\n" + listaMayores5);
                    }
                    break;

                case "3":
                    String listaTodos = guarderia.listarTodosLosNiños();
                    if (listaTodos.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "No hay niños registrados.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Lista de todos los niños:\n" + listaTodos);
                    }
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida. Intente de nuevo.");
                    break;
            }
        }
    }
}

