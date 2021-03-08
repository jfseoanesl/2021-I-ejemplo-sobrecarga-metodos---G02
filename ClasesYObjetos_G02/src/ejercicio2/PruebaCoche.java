/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author jairo
 */
public class PruebaCoche {
    
    public static void main(String arg[]){
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Marca: ");
        String marca=entrada.next();
        
        System.out.print("Modelo: ");
        int modelo=entrada.nextInt();
        
        System.out.print("Matricula: ");
        String matricula = entrada.next();
        
        Coche miCoche = crearCoche(marca, "Blanco", matricula, modelo, 5, 136);
        printInfoCoche(miCoche);
        
    }
    
    public static Coche crearCoche(String ma, String co, String mat, int mo, int np, int nc){
        Coche coche = new Coche();
        
        coche.setColor(co);
        coche.setMarca(ma);
        coche.setMatricula(mat);
        coche.setModelo(mo);
        coche.setNCaballos(nc);
        coche.setNPuertas(np); 
        
        return coche;
    }
    
    public static void printInfoCoche(Coche coche){
        System.out.println("Marca: " + coche.getMarca());
        System.out.println("Modelo: " + coche.getModelo());
        System.out.println("Color: " + coche.getColor());
        System.out.println("Matricula: " + coche.getMatricula());
        System.out.println("No Caballos: " + coche.getNCaballos());
        System.out.println("No Puertas: " + coche.getNPuertas());
    }
    
}
