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
public class Compra {
    public static void main(String[] args) {
        double compra, descuento, total;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa el total de tu compra: ");
        compra = leer.nextDouble();
        
        if(compra>300)
            descuento = compra*0.20;
        else
            descuento = 0.0;
        
        total = compra - descuento;
        System.out.println("Tu total a pagar es: " + total);
        System.out.println("Tu descuento fue de: " + descuento);
    }
}
