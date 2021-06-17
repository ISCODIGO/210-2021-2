/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana3;

/**
 *
 * @author enrique
 */
public class Euler1 {
    public static void main(String[] args) {
        int N = 1000;
        int acumulador = 0;
        
        for (int i = 1; i < N; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                acumulador += i;
            }
        }
        System.out.println(acumulador);
    }
}
