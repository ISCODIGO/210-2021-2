/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana5;

import javax.swing.JOptionPane;
import java.util.Random;

/**
 *
 * @author enrique
 */
public class JuegoAdivinaNumero {
    public static void main(String[] args) {
        int candidato;
        int valorMin = 1;
        int valorMax;       
        int incognita;
        int intentos;
        String inputLimite;
        String mensaje = "";
        
        // Bucle para indicar los rangos
        do {
            inputLimite = JOptionPane.showInputDialog(null, 
                "Determine el rango para el juego:\nA. 1-20 \nB. 1-50 \nC. 1-100").toLowerCase();            
        } while (!inputLimite.equals("a") && !inputLimite.equals("b") 
                && !inputLimite.equals("c"));

        // Variacion del switch cuando se busca inicializar una variable
        valorMax = switch (inputLimite) {
            case "a" -> 20;
            case "b" -> 50;
            case "c" -> 100;
            default -> 20;
        };
     
        // Se busca un valor aleatorio entre 1 y valorMax
        Random random = new Random();
        incognita = random.nextInt(valorMax) + 1;
        // System.out.println("Incognita=" + incognita);
        
        /* Esta es una formula predefinida log2 (valorMax). 
           Math.floor lleva los valores al entero inferior. */
        intentos = (int)Math.floor(Math.log10(valorMax) / Math.log10(2));
        
        // Bucle para encontrar un candidato
        do {
            String candidatoInput = JOptionPane.showInputDialog("Escriba el numero. Tiene " + 
                    intentos + " intentos");
            candidato = Integer.parseInt(candidatoInput);
            intentos--;                      
            
            /* Se redefinio la sentencia de control para establecer condiciones 
               que reflejen la misma naturaleza (por un lado la revisiones de
               intentos y por otro la revision del candidato). */
            if (intentos <= 0) {
                mensaje = "Perdio. El valor era " + incognita;
            } else {
                if (candidato < valorMin || candidato > valorMax) {
                    mensaje = "Fuera de rango!";
                } else if (candidato < incognita) {
                    mensaje = candidato + " es MENOR. Debe aumentar.";
                } else if (candidato > incognita) {
                    mensaje = candidato + " es MAYOR. Debe disminuir.";
                } else if (candidato == incognita) {
                    mensaje = "HA GANADO!!!";            
                } 
            }
            
            
          
                             
            JOptionPane.showMessageDialog(null, mensaje);
        } while(candidato != incognita && intentos > 0);
        System.out.println("FIN DEL JUEGO");
    }
}
