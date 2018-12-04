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
public class Calculadora {
    private int a, b;

    public Calculadora() {
    }
    
    public Calculadora(int a, int b) {
        this.a = a;
        this.b = b;
    }
    
    public void sumar(int a, int b){
        int suma = a + b;
        System.out.println("La sumas es: " + suma);
    }
    
    public void sumar(double a, double b){
        double suma = a + b;
        System.out.println("La suma es: " + suma);
    }
    
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        double c = 6.6;
        double d = 7.4;
        
        Calculadora cal = new Calculadora();
        
        cal.sumar(a, b);
        cal.sumar(c, d);
        
        
        
        
        
    }
    
}
