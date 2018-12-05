/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Paquete2;

/**
 *
 * @author gamar
 */
import Paquete1.*;
public class ClaseB extends ClaseA{
    public static void main(String[] args) {
        
        //Public
        ClaseA obj1 = new ClaseA();
        obj1.mensajepublico();
        
        //Protected
        ClaseB obj2 = new ClaseB();
        obj2.mensajeprotegido();
        
        //Default
        ClaseA obj3 = new ClaseA();
        //obj3.mensajedefault();
        
        //Privado
        ClaseA obj4 = new ClaseA();
        //obj4.mensajeprivado();
    }
}
