/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana10.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 *
 * @author enrique
 */
public class FileException {
    public static void main(String[] args){
        File file = new File("c:\test\sample3.txt");
        // Al descomentar es necesario establecer un try-catch o lanzar la excepcion
        //FileReader fileReader = new FileReader(file);
        System.out.println("Fin");
    }
}
