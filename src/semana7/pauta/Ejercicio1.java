/*
Ejercicio 1

Un cliente considera comprar una casa.
Después de ver varios modelos, los tres que le gustan son el colonial, de 
entrada dividida y de una planta. El constructor les dio el precio base (HNL) y 
el área terminada en pies cuadrados (pies^2) de los tres modelos. Este quiere saber el 
[precio por pie cuadrado] de los tres modelos y el que tiene menor [precio por pie 
cuadrado]. Escriba un programa que acepte como entrada el precio base y el área 
terminada en pies cuadrados de los  tres modelos.

El programa debe dar salida al [precio por pie cuadrado] de los tres modelos y que 
tiene el menor [precio por pie cuadrado].

 */
package semana7.pauta;

import java.util.Scanner;



/**
 *
 * @author enrique
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        double precio1, precio2, precio3, area1, area2, area3, precioArea1, 
                precioArea2, precioArea3;
        Scanner console = new Scanner(System.in);
        
        System.out.println("** Colonial **");
        System.out.print("Precio: ");
        precio1 = console.nextDouble();
        System.out.print("Area: ");
        area1 = console.nextDouble();
        
        System.out.println("** Entrada dividida **");
        System.out.print("Precio: ");
        precio2 = console.nextDouble();
        System.out.print("Area: ");
        area2 = console.nextDouble();
        
        
        System.out.println("** Planta **");
        System.out.print("Precio: ");
        precio3 = console.nextDouble();
        System.out.print("Area: ");
        area3 = console.nextDouble();
        
        // Salidas
        precioArea1 = precio1 / area1;
        precioArea2 = precio2 / area2;
        precioArea3 = precio3 / area3;
        
        System.out.println("Relacion entre Precio y Area");
        System.out.println("Colonial: " + precioArea1);
        System.out.println("Entrada dividida: " + precioArea2);
        System.out.println("Planta: " + precioArea3);
        
        double minimo = Math.min(Math.min(precioArea1, precioArea2), precioArea3);
        System.out.println("El valor minimo es: " + minimo);
        
        if (precioArea1 == precioArea2 && precioArea2 == precioArea3) {
            System.out.println("Todas cuestan lo mismo");
        } else if (precioArea1 < precioArea2 && precioArea1 < precioArea3) {
            System.out.println("El mas barato es el colonial");
        } else if (precioArea2 < precioArea1 && precioArea2 < precioArea3) {
            System.out.println("El mas barato es el de entrada dividida");
        } else {
            System.out.println("El mas barato es el de planta");
        }
    }
}
