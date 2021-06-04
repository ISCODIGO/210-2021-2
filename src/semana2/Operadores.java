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
public class Operadores {
    public static void main(String[] args) {
        // PEMDAS
        // 3 + ((4 * 5) / 2)
        int resultado = 3 + 4 * 5 / 2;
        System.out.println("El resultado es 13?: " + resultado);
        
        int resultadoParentesis = (6 + 4) * 5 / 2;
        System.out.println("El resultado es 25?: " + resultadoParentesis);
        
        System.out.println("3 + 4 > 5: " + (3 + 4 > 5));
        System.out.println("(3 + 4 > 5) Y 10 != 10: " + (3 + 4 > 5 && 10 != 10));
        
        // 1. Aritmetico: +
        // 2. Comparaciones: >, !=
        // 3. Lógico: &&
    }
}
