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
public class Persona {
    //Atributos
    private String nombre;
    private char sexo;
    private int edad;

    //Constructor por defecto
    public Persona(){

    }

    //Constructor que recibe parámetros
    public Persona(String nombre, char sexo, int edad){
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
    }

    public void mayorEdad(int edad){
        if(edad > 18)
            System.out.println("Es mayor de edad");
        else
            System.out.println("Es menor de edad");
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", sexo=" + sexo + ", edad=" + edad + '}';
    }
    
    public String mostrarDatos(){
            String datos="Los datos son: \n";
            datos+=nombre+"\n";
            datos+=sexo+"\n";
            datos+=edad+"\n";
            return datos;
    }
    
    public static void main(String[] args) {
        Persona persona1=new Persona("José Roberto",'H', 20);
        Persona persona2=new Persona("Mayra", 'M', 17);
        Persona persona3=new Persona("Armando", 'H', 33);

        System.out.println(persona1.mostrarDatos());
        persona1.mayorEdad(20);

        System.out.println(persona2.mostrarDatos());
        persona2.mayorEdad(17);

        System.out.println(persona3.mostrarDatos());
        persona3.mayorEdad(33);

    }
    
}
