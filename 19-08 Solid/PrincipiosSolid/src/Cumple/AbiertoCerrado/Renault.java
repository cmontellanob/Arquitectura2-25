/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cumple.AbiertoCerrado;

/**
 *
 * @author Dell
 */
public class Renault implements ICoche{
    
    String marca;

    public Renault() {
        this.marca="Renault";
    }
    
    
    @Override
    public int getPrecio() {
       return 18000; 
    }

    @Override
    public String getMarca() {
      return this.marca;        
    }
    
    
}
