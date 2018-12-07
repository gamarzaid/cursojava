/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dia4;

/**
 *
 * @author Equipo_xx
 */
public class Computadora {
    DiscoDuro disco;
    Procesador proc;
    
    public Computadora(){
        DiscoDuro d = new DiscoDuro();
        disco = d;
        //disco = new DiscoDuro();
        Procesador p = new Procesador();
        proc = p;
    }
    
    public void cambiaDisco(DiscoDuro disco){
        this.disco = disco;
        System.out.println("Se cambió el disco duro");
    }
    
    public void cambiaProcesador(Procesador proc){
        this.proc = proc;
        System.out.println("Se cambió el procesador");
    }
    
}
