import javax.swing.*;
import java.util.Collections;
import java.util.LinkedList;

public class Ingreso {
    private LinkedList<Nombre>  nombres;

    public Ingreso() {
        nombres= new LinkedList<>();
    }
//este metodo es para agregar los nombres a la lista
    public void agregarNombre(String nombre) {
        nombres.add(new Nombre(nombre));
    }

    public void mostrarNombresInvertidos() {
        Collections.reverse(nombres);//collections permite editar de manera facil listas o conjuntos sin tener que hacerlo de manera manual
        for (Nombre nombre : nombres) {
            JOptionPane.showMessageDialog(null, nombre.getNombre());//para que retomen los nombres en ventana emergente
        }

    }

    public void eliminarNombre(String nombre) {
        nombres.remove(nombre);
    }



}
