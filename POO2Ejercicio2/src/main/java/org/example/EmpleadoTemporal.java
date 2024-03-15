package org.example;

public class EmpleadoTemporal extends Empleado {

    private String tipo;
    public EmpleadoTemporal(int edad, String nombre, int idEmpleado, double salario) {
        super(edad, nombre, idEmpleado, salario);
        tipo = "Temporal";
    }

    public String getTipo() {
        return tipo;
    }

    public void tipoEmpleado() {
        System.out.println("Empleado Temporal");;
    }

    @Override
    public String toString() {
        return "EmpleadoTemporal{" +
                "tipo='" + tipo + '\'' + "\n Edad" + this.getEdad() +
                "\n Nombre: " + this.getNombre() + "Salario" +this.getSalario() +
                "\n ID-Empleado" + this.getIdEmpleado() +
                '}';
    }
}
