/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana5;

/**
 *
 * @author enrique
 */
public class IgualdadString {
    public static void main(String[] args) {
        String s1 = "a";
        String s2 = new String("a");
        
        // Comparar si los objetos son el mismo
        System.out.println(s1 == s2);
        System.out.println(s1);
        System.out.println(s2);
       
        // Comparar si los objetos tienen el mismo valor
        System.out.println(s1.equals(s2));
    }
}
