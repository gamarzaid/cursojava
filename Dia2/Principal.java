/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dia2;

/**
 *
 * @author Equipo_xx
 */
public class Principal {
    public static void main(String[] args) {
        Instrumento inst =  new Instrumento();
        inst.tocar();
        Guitarra gui = new Guitarra();
        gui.tocar();
        
        Instrumento guitarra = new Guitarra();
        guitarra.tocar();
        
       
    }
    
}
