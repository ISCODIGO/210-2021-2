/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana3;

import java.util.Scanner;


/**
 *
 * @author enrique
 */
public class PermutacionString {
    public static void main(String[] args) {
        // Mostrar datos en la consola.
            // System.out.print / println / printf
        // Recibir datos (consola)
            // Scanner
            
        Scanner entrada = new Scanner(System.in);
        /*System.out.print("Cantidad de frases:");
        int cantidad = entrada.nextInt();
        entrada.nextLine();*/
        String[] frases = new String[3];
        
        for(int i = 0; i < frases.length; i++) {
            System.out.printf("Escriba la frase #%d: ", i);
            frases[i] = entrada.nextLine();
        }
        
      
        int contador = 0;
        int iteraciones = 0;
        for (int i = 0; i < frases.length; i++) {
            for (int j = 0; j < frases.length; j++) {
                for (int k = 0; k < frases.length; k++) {
                    // Queremos evitar valores duplicados en la permutacion
                    if (i != j && i != k && j != k) {
                        System.out.printf("La palabra %d es %s%s%s.%n", ++contador, frases[i], frases[j], frases[k]);
                    }
                    iteraciones++;
                }           
            }
        }                
        System.out.println("Cantidad de iteraciones: " + iteraciones);
    }
}


/*
i!=j
j!=k

asumir que i!=k

printf = %n
print  = \n
println

*/