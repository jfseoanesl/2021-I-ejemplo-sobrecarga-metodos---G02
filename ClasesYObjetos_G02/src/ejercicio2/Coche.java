/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author jairo
 */
public class Coche {
    
    private String color, marca, matricula;
    private int modelo, nCaballos, nPuertas;
    
    public Coche(){ } 
    
    public String getColor(){ return this.color;}
    public String getMarca(){ return this.marca;}
    public String getMatricula(){ return this.matricula;}
    public int getModelo(){ return this.modelo;}
    public int getNCaballos(){ return this.nCaballos;}
    public int getNPuertas(){ return this.nPuertas;}
    
    public void setColor(String c){this.color = c;}
    public void setMarca(String m){this.marca=m;}
    public void setMatricula(String m){this.matricula=m;}
    public void setModelo(int m){this.modelo=m;}
    public void setNCaballos(int n){this.nCaballos=n;}
    public void setNPuertas(int n){this.nPuertas=n;}
    
}
