/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana4;

import javax.swing.JOptionPane;

/**
 *
 * @author enrique
 */
public class GUI1 {
    public static void main(String[] args) {                
        // Funcion de clase
        // Math.abs(-10.0);
        
        // Funcion de objeto
        // Scanner entrada = new Scanner(System.in);
        // entrada.nextLine();
        
        String respuesta = JOptionPane.showInputDialog(null, "Escriba un numero", 
                "Ejemplo de show input dialog", JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, respuesta);
    }
}
