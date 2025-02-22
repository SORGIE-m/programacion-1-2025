import javax.swing.*;
import java.util.LinkedList;

public class Guarderia {
    private String nombre;
    LinkedList <Niño> niños = new LinkedList <> ();

    public Guarderia(String nombre) {
        this.nombre = nombre;
        niños = new LinkedList <> ();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LinkedList<Niño> getNiños(){
        return niños;
    }

    public void setNiños(LinkedList<Niño> niños) {
        this.niños = niños;
    }

    public void agregarNiño(Niño niño){
        niños.add(niño);
    }

    public void removeNiño(Niño niño){
        niños.remove(niño);
    }

    public void actualizarNiño (Niño niñoActualizar){
        for (Niño indexNiño: niños){
            if (indexNiño.getId()==(niñoActualizar.getId())){

                indexNiño.setNombre(niñoActualizar.getNombre());
                indexNiño.setEdad(niñoActualizar.getEdad());
                indexNiño.setGenero(niñoActualizar.getGenero());
                indexNiño.setAlergias(niñoActualizar.getAlergias());
                indexNiño.setNombreAcu(niñoActualizar.getNombreAcu());
                indexNiño.getNumeroAcu(niñoActualizar.getNumeroAcu());
                break;
            }

        }
    }


}

