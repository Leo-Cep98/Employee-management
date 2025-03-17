import java.util.ArrayList;
import java.util.List;

public class GestionMain {
    public static void main(String[] args){
        List<Empleado> empleados = new ArrayList<>();
        empleados.add(new Gerente("Kenneth Ponte", 6809876, 6990.20));
        empleados.add(new Programador("Lauren Hodge", 5092890, 5250.89));
        empleados.add(new Soporte("Leonardo Cuesta", 6809912, 3890.78));

        for (Empleado emp : empleados) {
            emp.mostrarDatos();
        }
    }
}
