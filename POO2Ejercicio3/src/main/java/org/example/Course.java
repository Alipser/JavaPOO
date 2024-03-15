package org.example;

import java.util.ArrayList;

public class Course {
    private String codigo; private String nombre;
    private ArrayList<Student> listaEstudiantes;
    // Constructor
    public Course (String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.listaEstudiantes = new ArrayList<>();
    }
    // Métodos
    public void inscribirEstudiante (Student estudiante) {
        listaEstudiantes.add(estudiante);
    }
    public boolean removeStudent(int idEstudiante) {
        return listaEstudiantes.removeIf(e -> e.getId() == idEstudiante);
    }

    public void listarEstudiantes() {
        System.out.println("Students enrolled in the course" + nombre + ":");
        for (Student e : listaEstudiantes) {
            System.out.println("ID: " + e.getId() + ", Name: " + e.getName());
        }
    }
// Getters y Setters
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
