import java.util.LinkedList;

public class DeterminarModa {
    private LinkedList<Numero> numeros;

    public DeterminarModa() {
        numeros = new LinkedList<>();
    }

    public LinkedList<Numero> getNumeros() {
        return numeros;
    }

    public void setNumeros(LinkedList<Numero> numeros) {
        this.numeros = numeros;
    }

    public int obtenerNumeroModa() {
        int numeroModa = numeros.get(0).getNumero();
        int maxFrecuencia = 0;

        for (Numero numero1 : numeros) {
            int numeroComparar = numero1.getNumero();
            int frecuencia = 0;

            for (Numero numero2 : numeros) {
                if (numero2.getNumero() == numeroComparar) {
                    frecuencia++;
                }
            }

            if (frecuencia > maxFrecuencia) {
                maxFrecuencia = frecuencia;
                numeroModa = numeroComparar;
            }
        }

        return numeroModa;
    }
}
