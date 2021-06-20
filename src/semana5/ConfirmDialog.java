/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana5;

import javax.swing.JOptionPane;

/**
 *
 * @author enrique
 */
public class ConfirmDialog {
    public static void main(String[] args) {
        int confirmacion = JOptionPane.showConfirmDialog(null, "Prueba del confirm dialog");
        System.out.println("confirmacion es " + confirmacion);
        
        switch (confirmacion) {
            case JOptionPane.YES_OPTION:
                System.out.println("SI");
                break;
            case JOptionPane.NO_OPTION:
                System.out.println("NO");
                break;
            case JOptionPane.CANCEL_OPTION:
                System.out.println("Cancelar");
                break;
            default:
                System.out.println("Valor desconocido");
                break;
        }
        
        int confirmacion2 = JOptionPane.showConfirmDialog(null, "Prueba del confirm dialog", 
                "Titulo", JOptionPane.OK_CANCEL_OPTION);
        
        if (confirmacion2 == JOptionPane.OK_OPTION) {
            System.out.println("Presiono OK");
        } else if (confirmacion2 == JOptionPane.CANCEL_OPTION) {
            System.out.println("Presiono Cancel");
        }
        
    }
}
