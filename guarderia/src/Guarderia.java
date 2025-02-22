import javax.swing.JOptionPane;
import java.util.LinkedList;

public class Guarderia {
    private String nombre;
    private LinkedList<Niño> niños = new LinkedList<>();

    public Guarderia(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LinkedList<Niño> getNiños() {
        return niños;
    }

    public void agregarNiño(Niño niño) {
        niños.add(niño);
    }

    public void removeNiño(Niño niño) {
        niños.remove(niño);
    }

    public void actualizarNiño(Niño niñoActualizar) {
        for (Niño indexNiño : niños) {
            if (indexNiño.getId() == niñoActualizar.getId()) {
                indexNiño.setNombre(niñoActualizar.getNombre());
                indexNiño.setEdad(niñoActualizar.getEdad());
                indexNiño.setGenero(niñoActualizar.getGenero());
                indexNiño.setAlergias(niñoActualizar.getAlergias());
                indexNiño.setNombreAcu(niñoActualizar.getNombreAcu());
                indexNiño.setNumeroAcu(niñoActualizar.getNumeroAcu());
                break;
            }
        }
    }

    public boolean existeNiñoConId(int id) {
        for (Niño niño : niños) {
            if (niño.getId() == id) {
                return true;
            }
        }
        return false;
    }

    public String listarNiñosMayoresDe5() {
        StringBuilder lista = new StringBuilder();
        for (Niño niño : niños) {
            if (Integer.parseInt(niño.getEdad()) > 5) {
                lista.append(niño.getNombre()).append(" - ").append(niño.getEdad()).append(" años\n");
            }
        }
        return lista.toString();
    }

    public String listarTodosLosNiños() {
        StringBuilder lista = new StringBuilder();
        for (Niño niño : niños) {
            lista.append("ID: ").append(niño.getId()).append("\n")
                    .append("Nombre: ").append(niño.getNombre()).append("\n")
                    .append("Edad: ").append(niño.getEdad()).append(" años\n")
                    .append("Género: ").append(niño.getGenero()).append("\n")
                    .append("Alergias: ").append(niño.getAlergias()).append("\n")
                    .append("Acudiente: ").append(niño.getNombreAcu()).append("\n")
                    .append("Teléfono acudiente: ").append(niño.getNumeroAcu()).append("\n\n");
        }
        return lista.toString();
    }


}