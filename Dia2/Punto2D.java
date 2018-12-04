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
public class Punto2D {
    private double x;
    private double y;    

    public Punto2D() {
        this.x = 0.0;
        this.y = 0.0;
    }
    
    public Punto2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Punto2D{" + "x=" + this.x + ", y=" + this.y + '}';
    }

    public String imprime2D(){
        String salida = "( "+ this.x + " ," + this.y + " )";
        return salida;
    }
    
    public void imprime(){
        System.out.println("( "+ this.x + " ," + this.y + " )");
    }
    
}
