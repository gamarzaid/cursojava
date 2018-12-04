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
public class MainCoordenadas {
    public static void main(String[] args) {
        
        Punto2D p1 = new Punto2D();
        Punto2D p2 = new Punto2D(2.0, 3.0);
        
        System.out.println(p1.imprime2D());
        System.out.println(p2.imprime2D());
        
        p2.imprime();
        
        Punto3D p3 = new Punto3D();
        Punto3D p4 = new Punto3D(1.0, 3.0, 5.0);
        
        System.out.println(p3.imprime3D());
        System.out.println(p3.imprime3DD());
        
        System.out.println(p4.imprime3D());
        System.out.println(p4.imprime3DD());
        
        
    }
}
