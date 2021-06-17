/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana4;

/**
 *
 * @author enrique
 */
public class Euler3 {
    public static void main(String[] args) {
        // bucle de N/2 a 2
        // para buscar candidatos [primos] [divisores] de N
        // imprimir el mayor candidato
        
        long N = 600_851_475_143L;
        long primo = 2;
        long limite = N/2;
        long i = primo;
        
        while (i <= limite && primo <= limite) {
            // prueba de divisor
            if (N % i == 0) {
                // aqui hay que probar si es primo
                boolean esPrimo = true;
                for (long j = 2; j <= i/2; j++) {
                    if (i % j == 0) {
                        esPrimo = false;
                        break;
                    }
                }
                if (esPrimo) {
                    primo = i;
                    limite = N / primo;
                }
            }
            i++;
        }        
        
        System.out.println("Mayor divisor primo es: " + primo);
    }
}
