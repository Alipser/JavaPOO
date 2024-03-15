package org.example;

public class Empleado extends Persona {

    private int idEmpleado;

    private double salario;

    public Empleado(int edad, String nombre, int idEmpleado, double salario) {
        super(edad, nombre);
        this.idEmpleado = idEmpleado;
        this.salario = salario;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void tipoEmpleado(){
        System.out.println("Empleado");
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "idEmpleado=" + idEmpleado +
                ", salario=" + salario +
                '}';
    }
}
