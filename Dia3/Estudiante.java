/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Dia2;

/**
 *
 * @author gamar
 */
public class Estudiante extends Person{
    private String escuela;
    private String grado;

    public Estudiante(String escuela, String grado) {
        this.escuela = escuela;
        this.grado = grado;
    }

    public Estudiante(String escuela, String grado, String nombre, int edad) {
        super(nombre, edad);
        this.escuela = escuela;
        this.grado = grado;
    }

    public String getEscuela() {
        return escuela;
    }

    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }
    
    
}
