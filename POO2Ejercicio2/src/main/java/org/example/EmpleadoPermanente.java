package org.example;

public class EmpleadoPermanente extends Empleado {

    private String tipo;

    public EmpleadoPermanente(int edad, String nombre, int idEmpleado, double salario) {
        super(edad, nombre, idEmpleado, salario);
        tipo = "Permanente";
    }

    public String getTipo() {
        return tipo;
    }

    public void tipoEmpleado() {
        System.out.println("Empleado Permamente");
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
