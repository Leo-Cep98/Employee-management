public class Programador extends Empleado{
    private double salarioProgramador;
    public Programador(String nombre, int id, double salario){
        super(nombre, id, salario);
        calcularBonificacion();
    }
    @Override
    public void calcularBonificacion() {
        salarioProgramador = salario + (salario*0.1);
    }
    @Override
    public void mostrarDatos(){
        System.out.printf("\nLos detalles del empleado son: \nNombre: %s\nID: %d\nSalario: %.2f\nCon bonificación del 10 por ciento es: %.2f\n",nombre,id,salario,salarioProgramador);
    }
}
