/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dia1;

/**
 *
 * @author Equipo_xx
 */
public class Estudiante {
    private String nombre;
    private String cuenta;
    private char genero;
    
    public Estudiante(){
        nombre = "";
        cuenta = "";
        genero = ' ';
    }
    
    public Estudiante(String nombre, String cuenta, char genero){
        this.nombre = nombre;
        this.cuenta = cuenta;
        this.genero = genero;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return nombre;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "nombre=" + nombre + ", cuenta=" + cuenta + ", genero=" + genero + '}';
    }

   
    
    

    public static void main(String[] args) {
        Estudiante est1 = new Estudiante();
        Estudiante est2 = new Estudiante("Liliana", "12345", 'M');
        
        est1.setNombre("Gilberto");
        est2.setCuenta("123");
        
        System.out.println(est1.getNombre());
        System.out.println(est2.getCuenta());
        System.out.println(est2);
        
    }
}
