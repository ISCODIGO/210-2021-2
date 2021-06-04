/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana2;

import java.util.Scanner;


/**
 *
 * @author enrique
 */
public class Imports {
    public static void main(String[] args) {
        String s = "Hola mundo";
        System.out.println(Math.pow(2, 3));
        
        // Notacion a nivel de objeto. Ya que entrada es un objeto de tipo Scanner               
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escriba un numero: ");
        int numero = entrada.nextInt();
        System.out.println("El numero es: " + numero);
    }
}
