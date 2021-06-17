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
public class Euler5 {
    public static void main(String[] args) {
        int N = 20;
        boolean continuar = true;
        int valorMinimo = N * (N - 1);
        int candidato = valorMinimo;        
        
        while (continuar) {
            // Evaluar al candidato para ver si es divisible por todos los digitos
            boolean evaluado = true;
            for (int i = N; i >= 2; i--) {
                int residuo = candidato % i;
                
                // Si el candidato falla, no tengo que seguir evaluandolo.
                if (residuo != 0) {
                    evaluado = false;
                    break;
                }
            }
            
            if (evaluado) {
                continuar = false;
            } else {
                candidato += valorMinimo;
            }
        }
        
        System.out.println("Candidato es: " + candidato);
    }
}

/*
Euler = 232792560
Clase = 232792560
        232792560

Candidato
Divisible por 10.

90
100
110
120
*/