package org.example;

import java.util.ArrayList;
public class CourseManagement {
    private ArrayList<Course> courses;
    // Constructor
    public CourseManagement() {
        courses = new ArrayList<>();
    }
    public void addCourse (Course curse) {
        courses.add(curse);
    }
    public Course buscarCursoPorCodigo(String codigo) {
        for (Course curse : courses) {
            if (curse.getCodigo().equals(codigo)) {
                return curse;
            }
        }
        return null;
    }
    public void showStudents(String code) {
        Course curse = buscarCursoPorCodigo (code);
        if (curse != null) {
            curse.listarEstudiantes();
        } else {
            System.out.println("Curse not found.");
        }
    }
}
