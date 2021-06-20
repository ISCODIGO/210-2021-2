/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana5;

import java.util.Arrays;
import java.util.Random;
/**
 *
 * @author enrique
 */
public class RandomDemo {
    public static void main(String[] args) {
        Random random = new Random();
        int N = 10;
        int[] arreglo = new int[N+5];
        int[] arreglo2 = new int[N+5];
        System.out.println("random.nextInt");
        for (int i = 0; i < 100; i++) {
            int numeroAleatorio = random.nextInt(N);
            arreglo[numeroAleatorio]++;
        }
        System.out.println(Arrays.toString(arreglo));
        
        System.out.println("random.nextInt + 1");
        for (int i = 0; i < 100; i++) {
            int numeroAleatorio = random.nextInt(N) + 1;
            //System.out.println(numeroAleatorio);
            arreglo2[numeroAleatorio]++;
        }
        System.out.println(Arrays.toString(arreglo2));
    }
}
