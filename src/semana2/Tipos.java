/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana2;

/**
 *
 * @author enrique
 */
public class Tipos {
    public static void main(String[] args) {
        int valorEntero1 = 10;
        System.out.println( "Pre-incremento: " + (++valorEntero1) );
        int valorEntero2 = 10;
        System.out.println( "Post-incremento: " + (valorEntero2++) );
        System.out.println( "Valor despues del Post-incremento: " + valorEntero2);
        
        int valorEntero3 = Integer.MAX_VALUE;
        System.out.println("Valor maximo de los enteros: " + valorEntero3);
        System.out.println( "El valor maximo de los enteros + 1: " + 
                (++valorEntero3) );
        System.out.println("Valor minimo de los enteros: " + Integer.MIN_VALUE);
        
        int valorEntero4 = Integer.MIN_VALUE;
        System.out.println("El valor minimo de los enteros - 1: " + 
                (--valorEntero4));
        
        
 
    }
}
