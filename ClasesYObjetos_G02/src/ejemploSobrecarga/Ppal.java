/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploSobrecarga;

import java.util.Scanner;

/**
 *
 * @author jairo
 */
public class Ppal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
       
        // constuctor por defecto
        System.out.println("Rectangulo con base y altura por defecto: ");
        Rectangulo r = new Rectangulo();
        infoRectangulo(r);
        
        // cosntructor sobrecargado 1
        System.out.println("Rectangulo con base variable(Sobrecarga 1): ");
        System.out.print("Lea Base: ");
        double base= entrada.nextDouble();
        Rectangulo r1 = new Rectangulo(base);
        infoRectangulo(r1);
        
        System.out.println("Rectangulo con base y altura variable (sobrecargado 2): ");
        System.out.print("Lea altura: ");
        double altura= entrada.nextDouble();
        System.out.print("Lea Base: ");
        base= entrada.nextDouble();
        Rectangulo r2 = new Rectangulo(base, altura);
        infoRectangulo(r2);
        
    }
    
    public static void infoRectangulo(Rectangulo r){
        System.out.println("Base: " + r.getBase());
        System.out.println("Altura: " + r.getAltura());
        System.out.println("Area: " + r.calcularArea());
        System.out.println("Perimetro: "+r.calcularPerimetro());
        System.out.println("\n");
    }
    
}
