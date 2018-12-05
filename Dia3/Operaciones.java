/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gamar
 */
public class Operaciones {

    private double numero1 = 0.0;
    private double numero2 = 0.0;
    private double resultado = 0.0;


    public double getNumero1(){
            return numero1;
    }

    public void setNumero1(double numero1){
            this.numero1 = numero1;
    }

    public double getNumero2(){
            return numero2;
    }

    public void setNumero2(double numero2){
            this.numero2 = numero2;
    }

    public double Suma(double numero1, double numero2){
        try{
            resultado = numero1 + numero2;
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return resultado;	
    }

    public double Resta(double numero1, double numero2){
        try{
            resultado = numero1 - numero2;
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return resultado;	
    }

    public double Multiplicacion(double numero1, double numero2){
        try{
            resultado = numero1 * numero2;
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return resultado;
    }

    public double Division(double numero1, double numero2){
        try{
            resultado = numero1 / numero2;
        }
        catch(Exception e){
            System.out.println("No se permite división entre cero.");
        }
        return resultado;
    }
    
}
