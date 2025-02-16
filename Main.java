import java.util.ArrayList;
import java.util.List;

class Empleado {
    private String nombre;
    private int id;
    private double salario;

    public Empleado(String nombre, int id, double salario) {
        this.nombre = nombre;
        this.id = id;
        this.salario = salario;
    }

    public String getNombre() { return nombre; }
    public int getId() { return id; }
    public double getSalario() { return salario; }

    public void mostrarInformacion() {
        System.out.println("ID: " + id + ", Nombre: " + nombre + ", Salario: " + salario);
    }
}

class Empresa {
    private List<Empleado> empleados;

    public Empresa() {
        empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void listarEmpleados() {
        System.out.println("Lista de empleados:");
        for (Empleado e : empleados) {
            e.mostrarInformacion();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();

        Empleado emp1 = new Empleado("Juan Perez", 101, 50000);
        Empleado emp2 = new Empleado("Ana Lopez", 102, 55000);

        empresa.agregarEmpleado(emp1);
        empresa.agregarEmpleado(emp2);

        empresa.listarEmpleados();
    }
}