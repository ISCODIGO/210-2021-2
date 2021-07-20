/*
Utilizando repeticiones desarrollar un programa que imprima una figura; la cual 
debe solicitar un valor por medio de Scanner ese valor es la indicación del 
"pico" de la figura. Para este caso el pico fue 5. Pero el usuario puede colocar 
cualquier valor (que sea entre 2 y 20):

*
**
***
****
*****



****
***
**
*


 */
package semana7.pauta;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Indique el pico de la figura: ");
        int pico = console.nextInt();
        
        if (pico >= 2 && pico <= 20) {
            for(int i = 1; i <= pico; i++) {
                for (int k = 1; k <= i; k++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
            
            for(int i = pico - 1; i >= 1; i--) {
                for (int k = 1; k <= i; k++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
        }
    }
}
