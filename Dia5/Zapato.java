/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gamar
 */
public class Zapato {
    private double numero;
    private String color, marca;

    public Zapato(double numero, String color, String marca) {
        this.numero = numero;
        this.color = color;
        this.marca = marca;
    }

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return marca + " - " + color + " - " + numero + "\n";
    }
}
