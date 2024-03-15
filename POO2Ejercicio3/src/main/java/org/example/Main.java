package org.example;

public class Main {
    public static void main(String[] args) {
        CourseManagement manejadorCursos = new CourseManagement();

        Course biologiI = new Course("DT102","Biology");
        Course biologiII = new Course("DT105","BiologyII");

        Student primerEstudiante = new Student(1,"Estudiante1","E1@gmail.com");
        Student segundoEstudiante = new Student(1,"Estudiante2","E2@gmail.com");

        biologiII.inscribirEstudiante(primerEstudiante );
        biologiI.inscribirEstudiante(primerEstudiante);

        manejadorCursos.addCourse(biologiII);
        manejadorCursos.addCourse(biologiI);

        manejadorCursos.showStudents("CS23101");
        manejadorCursos.showStudents("DT102");
    }
}
