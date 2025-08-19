/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cumple.AbiertoCerrado;

/**
 *
 * @author Dell
 */
public class ValorCoche {

    public static void main(String[] args) {
        ICoche[] arregloCoches = {
            new Renault(),
            new Audi(),
            new Toyota()

        };
        imprimirPrecioMedioCoche(arregloCoches);
    };
    private static void imprimirPrecioMedioCoche(ICoche[] arregloCoches) {
        for (ICoche coche : arregloCoches) {
            System.out.println(coche.getMarca() + ":" + coche.getPrecio());
        }

    }

}
