/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cumple.AbiertoCerrado;

/**
 *
 * @author Dell
 */
public class Toyota implements ICoche {
       
    public Toyota() {
       
    }
    
    
    @Override
    public int getPrecio() {
       return 35000; 
    }

    @Override
    public String getMarca() {
      return "Toyota";        
    }
    
}
