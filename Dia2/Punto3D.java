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
public class Punto3D extends Punto2D{
    private double z;
    
    public Punto3D(){
        super();
        this.z = 0.0;
    }
    
    public Punto3D(double x, double y, double z){
        super(x, y);
        this.z = z;
    }
    
    public String imprime3D(){
        String salida = "( "+ Punto3D.super.getX() + " ," + Punto3D.super.getY() + " , " + this.z + " )";
        return salida;
    }
    
    public String imprime3DD(){
        String salida = "( "+ getX() + " ," + getY() + " , " + this.z + " )";
        return salida;
    }
    
    
    

}
