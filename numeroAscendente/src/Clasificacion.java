import java.util.LinkedList;

public class Clasificacion {
    private LinkedList <Numero> numeros;

    public Clasificacion() {
        numeros = new LinkedList <>();
    }

    public LinkedList<Numero> getNumeros() {
        return numeros;
    }

    public void setNumeros(LinkedList<Numero> numeros) {
        this.numeros = numeros;
    }

    public void agregarNumero(int numero){
        numeros.add(new Numero(numero));
    }

    public OrdenarNumeros
}
