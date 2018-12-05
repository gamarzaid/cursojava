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
public class ClaseA {
    //Publico
    public void mensajepublico(){
        System.out.println("Método public");
    }
    
    //Protegido
    protected void mensajeprotegido(){
        System.out.println("Método protected");
    }
    
    //Sin modificador
    void mensajedefault(){
        System.out.println("Método sin modificador");
    }
    
    //Privado
    private void mensajeprivado(){
        System.out.println("Método privado");
    }
    
    public static void main(String[] args) {
        ClaseA obj1 = new ClaseA();
        obj1.mensajepublico();
        obj1.mensajeprotegido();
        obj1.mensajedefault();
        obj1.mensajeprivado();
    }
}
