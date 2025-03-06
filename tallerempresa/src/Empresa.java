import javax.swing.*;
import java.util.LinkedList;

public class Empresa {
    private String nombre;
    private String nit;
    private LinkedList<Empleado> empleados;

    public Empresa(String nombre, String nit) {
        this.nombre = nombre;
        this.nit = nit;
        this.empleados = new LinkedList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public LinkedList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(LinkedList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public void agregarEmpleado(Empleado nuevoEmpleado) {
        // Verificar si ya hay 50 empleados
        if (empleados.size() >= 50) {
            JOptionPane.showMessageDialog(null, "No se pueden agregar más empleados, la empresa está llena.");
            return;
        }

        // Verificar si ya existe un empleado con el mismo ID
        for (Empleado empleado : empleados) {
            if (empleado.getId().equals(nuevoEmpleado.getId())) {
                JOptionPane.showMessageDialog(null, "Ya existe un empleado con el ID " + nuevoEmpleado.getId() + ".");
                return;
            }
        }

        // Si no hay problemas, agregar el empleado
        empleados.add(nuevoEmpleado);
        JOptionPane.showMessageDialog(null, "Empleado agregado: " + nuevoEmpleado.getNombre());
    }

    public void listarEmpleados() {
        String lista = "Lista de empleados:\n";
        for (Empleado empleado : empleados) {
            lista += empleado.toString() + "\n";
        }
        JOptionPane.showMessageDialog(null, lista);
    }

    public void asignarSalarioBase() {
        for (Empleado empleado : empleados) {
            switch (empleado.getCargo()) {
                case "CEO":
                    empleado.setSalario(14000000);
                    break;
                case "Administrador":
                    empleado.setSalario(8000000);
                    break;
                case "Desarrollador":
                    empleado.setSalario(4000000);
                    break;
                case "Conserje":
                    empleado.setSalario(2000000);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Cargo no reconocido para el empleado: " + empleado.getNombre());
            }
        }
        JOptionPane.showMessageDialog(null, "Salarios asignados correctamente.");
    }

    public int calcularNomina(Empleado empleado) {
        int nomina = empleado.getSalario(); // Obtener el salario base del empleado

        // Aplicar aumentos según el tiempo en la empresa
        if (empleado.getTiempo() >= 10) {
            nomina += (int) (nomina * 0.15); // Aumento del 15% para 10 años o más
        } else if (empleado.getTiempo() >= 5) {
            nomina += (int) (nomina * 0.10); // Aumento del 10% para 5 años o más
        } else if (empleado.getTiempo() >= 3) {
            nomina += (int) (nomina * 0.05); // Aumento del 5% para 3 años o más
        } else {
            JOptionPane.showMessageDialog(null, "El empleado " + empleado.getNombre() + " no lleva el tiempo suficiente para tener aumentos de nómina.");
        }

        return nomina; // Devolver la nómina calculada
    }
}