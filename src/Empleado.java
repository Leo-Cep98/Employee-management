public abstract class Empleado {
    protected String nombre;
    protected int id;
    protected double salario;

    public Empleado (String nombre, int id, double salario){
        this.nombre =nombre;
        this.id = id;
        this.salario=salario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }
    public double getSalario() {
        return salario;
    }

    void mostrarDatos(){
        System.out.println("\nLos detalles del empleado son: \nNombre: "+nombre+"\nID: "+id+"\nSalario: "+salario);
    }

    public abstract void calcularBonificacion();
}
