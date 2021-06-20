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
        /* GUI = Graphical User Interface -> Interfaz gráfica de usuario
           Funcion de clase
           ----------------
           Math.abs(-10.0);
        
           Funcion de objeto
           -----------------
           Scanner entrada = new Scanner(System.in);
           entrada.nextLine();
        */
        
        String respuesta = JOptionPane.showInputDialog(null, "Escriba un numero "
                + "para devolver su valor al cuadrado", 
                "Ejemplo de show input dialog", JOptionPane.QUESTION_MESSAGE);
        
        // Potencial linea de Exception: En caso que no se transforme en entero.
        if (respuesta != null) {
            int valor = Integer.parseInt(respuesta);                    
            int cuadrado = (int)Math.pow(valor, 2);
            JOptionPane.showMessageDialog(null, cuadrado, "El valor al cuadrado es", 
                    JOptionPane.INFORMATION_MESSAGE);
            
        } else {
            System.out.println("La respuesta fue null");
        }
    }
}
