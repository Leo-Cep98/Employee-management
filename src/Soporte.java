public class Soporte extends Empleado {
    double salarioSoporte;
    public Soporte(String nombre,int id, double salario){
        super(nombre, id, salario);
        calcularBonificacion();
    }
    @Override
    public void calcularBonificacion() {
     salarioSoporte = salario + (salario*0.05);
    }
    @Override
    public void mostrarDatos(){
        System.out.printf("\nLos detalles del empleado son: \nNombre: %s\nID: %d\nSalario: %.2f\nCon bonificación del 5 por ciento es: %.2f\n",nombre,id,salario,salarioSoporte);
    }
}
