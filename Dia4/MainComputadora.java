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
public class MainComputadora {
    public static void main(String[] args) {
        Computadora compu = new Computadora();
        System.out.println(compu.disco.marca);
        DiscoDuro disco = new DiscoDuro("Samsung", "1TB");
        compu.cambiaDisco(disco);
        System.out.println(compu.disco.marca);
    }
}
