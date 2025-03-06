import javax.swing.*;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Compañia compañia = new Compañia("Fufurachas", "215463513");
        LinkedList<Empleado> empleados = new LinkedList<>();

        boolean continuar = true;

        while (continuar) {
            // Pedimos los datos del empleado
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre:");
            if (nombre == null) break;

            String identificacion = JOptionPane.showInputDialog("Ingrese la identificación:");
            if (identificacion == null) break;

            String correo = JOptionPane.showInputDialog("Ingrese el correo:");
            if (correo == null) break;

            String telefono = JOptionPane.showInputDialog("Ingrese el teléfono:");
            if (telefono == null) break;

            String puesto = JOptionPane.showInputDialog("Ingrese el puesto:");
            if (puesto == null) break;

            String fecha = JOptionPane.showInputDialog("Ingrese la fecha:");
            if (fecha == null) break;

            // Creamos el empleado y lo agregamos a la lista
            Empleado newEmpleado = new Empleado(nombre, identificacion, correo, telefono, puesto, fecha);
            empleados.add(newEmpleado);

            // Preguntamos si desea ingresar otro empleado
            int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea ingresar otro empleado?", "Continuar", JOptionPane.YES_NO_OPTION);
            if (respuesta != JOptionPane.YES_OPTION) {
                continuar = false;
            }
        }

        // Mostramos los empleados ingresados
        String mensaje = "Lista de empleados de la compañía " + compañia.getNombre() + ":\n";
        for (Empleado empleado : empleados) {
            mensaje += "Nombre: " + empleado.getNombre() + "\n"
                    + "Identificación: " + empleado.getIdentificacion() + "\n"
                    + "Correo: " + empleado.getCorreo() + "\n"
                    + "Teléfono: " + empleado.getTelefono() + "\n"
                    + "Puesto: " + empleado.getPuesto() + "\n"
                    + "Fecha: " + empleado.getFecha() + "\n\n";
        }

        JOptionPane.showMessageDialog(null, mensaje);
    }
}
