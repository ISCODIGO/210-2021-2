/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana10.exceptions;

import java.util.Scanner;

/**
 *
 * @author enrique
 */
public class NullPointer {
    public static void main(String[] args) {
        Scanner scan = null;
        int a = scan.nextInt();
    }
}
