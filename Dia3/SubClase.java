/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Paquete1;

/**
 *
 * @author gamar
 */
public class SubClase extends ClaseA{
    
    public static void main(String[] args) {
        ClaseA obj1 = new ClaseA();
        obj1.mensajepublico();
        obj1.mensajeprotegido();
        obj1.mensajedefault();
        //obj1.mensajeprivado();
    }
}
