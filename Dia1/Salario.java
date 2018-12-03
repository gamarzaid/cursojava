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
import java.util.Scanner;
public class Salario {
    public static void main(String[] args) {
        int horasTrabajadas = 0;
        int horasExtras = 0;
        int salario = 0;
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa las horas trabajadas: ");
        horasTrabajadas = leer.nextInt();
        
        if(horasTrabajadas > 40){
            horasExtras = horasTrabajadas - 40;
            salario = 40*16+horasExtras*20;
            System.out.println("Tu salario con horas extras es: " + salario);
        }
        else{
            salario = horasTrabajadas*16;
            System.out.println("Tu salario es: " + salario);
        }
        
    }
    
}
