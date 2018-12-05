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
public class EstudianteIntercambio extends Estudiante{
    private String pais;

    public EstudianteIntercambio(String pais, String escuela, String grado) {
        super(escuela, grado);
        this.pais = pais;
    }

    public EstudianteIntercambio(String pais, String escuela, String grado, String nombre, int edad) {
        super(escuela, grado, nombre, edad);
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    
    public String imprimeDatos(){
        String datos="Los datos son: \n";
        return datos;
    }
    

}
