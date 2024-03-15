package org.example;

import java.util.ArrayList;

public class GestionEmpleados {


    private ArrayList<Empleado> listaEmpleados ;

    public GestionEmpleados() {
        this.listaEmpleados = new ArrayList<>();
    }

    public ArrayList<Empleado> getListaEmpleados() {
        for (Empleado empleadoEnLista: listaEmpleados){
            System.out.println(empleadoEnLista);
        }
        return listaEmpleados;
    }

    public Empleado getEmpleadoByName(){
        return listaEmpleados.
    }




}
