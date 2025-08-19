/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NoCumple.AbiertoCerrado;

/**
 *
 * @author Dell
 */
public class ValorCoche {

    public static void main(String[] args) {
        Coche[] arregloCoches = {
            new Coche("Renault"),
            new Coche("Audi"),
            new Coche("Toyota")
        };
        imprimirPrecioMedioCoche(arregloCoches);
    }

    ;
        
       

    private static void imprimirPrecioMedioCoche(Coche[] arregloCoches) {
        for (Coche coche:arregloCoches)
        {
            if(coche.getMarca().equals("Renault"))
            {
                System.out.println("Renault:"+18000);
            }
            if(coche.getMarca().equals("Audi"))
            {
                System.out.println("Audi:"+25000);
            }
            if(coche.getMarca().equals("Toyota"))
            {
                System.out.println("Toyota:"+32000);
            }
    }

}

}
