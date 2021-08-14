/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana10.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author enrique
 */
public class DivZero {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a;
        int b;
        int c = 0;
        
        try {
            System.out.print("Se hara la operacion: a/b. \nValor de a: ");
            a = scan.nextInt();
            System.out.print("Valor de b: " );
            b = scan.nextInt();
            c = dividir(a, b);
            System.out.println("El resultado es " + c);
        } 
        catch(ArithmeticException aex) {
            c = 0;
        }
        catch(Exception ex) {
            ex.printStackTrace();
        }
        
        if (c % 2 == 0) {
            System.out.println("Es par");
        } else {
            System.out.println("Es impar");
        }
        
        int d;
        try {
            d = dividir(4, 0);            
            System.out.println(d);
        } catch (Exception ex) {
            Logger.getLogger(DivZero.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        // Genera un error en tiempo de compilacion
        //d = dividir(4, 0);     
        
        System.out.println("Fin del programa");
    }
    
    public static int dividirDefensivo(int a, int b) {
        if (b == 0)
            return 0;
        return a / b;        
    }
    
    public static int dividir(int a, int b) throws Exception {
        return a / b;        
    }
    
    public static int dividirThrow(int a, int b) throws Exception {
        if (b == 0)
            throw new Exception("Intento de division cero");
        
        return a / b;        
    }
}
