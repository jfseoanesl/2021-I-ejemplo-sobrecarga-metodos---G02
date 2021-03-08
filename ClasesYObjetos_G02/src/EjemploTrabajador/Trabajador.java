/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemploTrabajador;

/**
 *
 * @author jairo
 */
public class Trabajador {
    private double horasT;
    public static double valorH;
    
    public Trabajador(){ }
    
    public double getHorasT(){return this.horasT;}
    public void setHorasT(double n){this.horasT=n;}
   
    
    public double calcularPago(){return this.horasT * Trabajador.valorH;}
}
