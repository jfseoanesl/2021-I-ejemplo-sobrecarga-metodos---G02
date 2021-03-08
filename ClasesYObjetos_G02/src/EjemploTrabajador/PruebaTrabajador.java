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
public class PruebaTrabajador {
    
    public static void main(String arg[]){
        
        Trabajador.valorH = 200;
        
        Trabajador juan = new Trabajador();
        juan.setHorasT(50);
        System.out.println("Sueldo juan: " + juan.calcularPago());
        
        Trabajador pedro = new Trabajador();
        pedro.setHorasT(10);
        System.out.println("Sueldo pedro: " + pedro.calcularPago());
        
        System.out.println("----------------------------");
        
        Trabajador.valorH = 500;
        System.out.println("Sueldo juan: " + juan.calcularPago());
        System.out.println("Sueldo pedro: " + pedro.calcularPago());
        
    }
    
}
