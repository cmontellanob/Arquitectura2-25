/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cumple.InversionDependencias;





/**
 *
 * @author Dell
 */
public class CocheBd {
    
    IConexion coneccion;

    public CocheBd(IConexion coneccion) {
        this.coneccion = coneccion;
    }
    
    
    
    boolean guardarCoche(Coche coche){
       coneccion.conectarse();
        return true;
    }
    boolean elimnarCoched(Coche coche){
        coneccion.conectarse();
        return true;
    }
    
}
