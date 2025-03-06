public class Empleado {
    private String nombre;
    private String id;
    private String cargo;
    private int tiempo;
    private int salario;

    public Empleado(String nombre, String id, String cargo, int tiempo, int salario) {
        this.nombre = nombre;
        this.id = id;
        this.cargo = cargo;
        this.tiempo = tiempo;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", id='" + id + '\'' +
                ", cargo='" + cargo + '\'' +
                ", tiempo=" + tiempo +
                ", salario=" + salario +
                '}';
    }
}