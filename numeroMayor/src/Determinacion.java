import java.util.LinkedList;

public class Determinacion {
    private LinkedList<Numero> numeros;

    public Determinacion() {
        numeros = new LinkedList<>();
    }

    public void agregarNumero(int numero) {
        numeros.add(new Numero(numero));
    }

    public String identificarMayor() {

        int numero1 = numeros.get(0).getNumero();
        int numero2 = numeros.get(1).getNumero();
        int numero3 = numeros.get(2).getNumero();

        if (numero1 == numero2 && numero2 == numero3) {
            return "Todos los números son iguales.";
        }

        int mayor = Math.max(numero1, Math.max(numero2, numero3));
        return "El número mayor es: " + mayor;
    }
}
