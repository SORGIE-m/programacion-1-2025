public class Niño {
    private String nombre;
    private String edad;
    private String genero;
    private int id;
    private String alergias;
    private String nombreAcu;
    private String numeroAcu;

    public Niño(String nombre, String edad, String genero,
                String id, String alergias, String nombreAcu, String numeroAcu) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.id = 0;
        this.alergias = alergias;
        this.nombreAcu = nombreAcu;
        this.numeroAcu = numeroAcu;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getId() {
        return id;
    }
    public void setId(String id) {
        this.id = 0;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public String getNombreAcu() {
        return nombreAcu;
    }

    public void setNombreAcu(String nombreAcu) {
        this.nombreAcu = nombreAcu;
    }

    public String getNumeroAcu() {
        return numeroAcu;
    }

    public void setNumeroAcu(String numeroAcu) {
        this.numeroAcu = numeroAcu;
    }


}
