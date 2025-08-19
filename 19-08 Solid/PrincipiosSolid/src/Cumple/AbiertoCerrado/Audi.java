/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cumple.AbiertoCerrado;

/**
 *
 * @author Dell
 */
public class Audi implements ICoche {
       String marca;

    public Audi() {
        this.marca="Audi";
    }
    
    
    @Override
    public int getPrecio() {
       return 25000; 
    }

    @Override
    public String getMarca() {
      return this.marca;        
    }
    
}
