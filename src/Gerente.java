public class Gerente extends Empleado{
    private double salarioGerente;
    public Gerente(String nombre, int id, double salario){
        super(nombre, id, salario);
        calcularBonificacion();
    }
    @Override
    public void calcularBonificacion() {
       salarioGerente = salario+(salario*0.2);
    }
    @Override
    public void mostrarDatos(){
        System.out.printf("\nLos detalles del empleado son: \nNombre: %s\nID: %d\nSalario: %.2f\nCon bonificación del 20 por ciento es: %.2f\n",nombre,id,salario,salarioGerente);
    }
}
