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
public class Procesador {
    String marca;
    String velocidad;
    
    public Procesador(){
        this.marca = "Sin marca";
        this.velocidad = "0GHz";
    }
    
    public Procesador(String marca, String velocidad){
        this.marca = marca;
        this.velocidad = velocidad;
    }
    
}
