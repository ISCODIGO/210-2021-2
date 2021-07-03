/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana6;


import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


/**
 *
 * @author enrique
 */
public class Ventana {
    private static void configurarVentana(JFrame ventana) {
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.pack();
        //ventana.setBounds(100, 100, 500, 300);
        //ventana.setSize(500, 300);
        ventana.setVisible(true);
    }
    
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Ventana de prueba");
        //ventana.setLayout(new BoxLayout(ventana.getContentPane(), BoxLayout.PAGE_AXIS));
        //ventana.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 20));
        ventana.setLayout(new GridLayout(4, 2, 10, 10));
        JButton boton1 = new JButton("Boton 1");
        JButton boton2 = new JButton("Boton 2");
        JLabel label1 = new JLabel("Etiqueta 1");
        JLabel label2 = new JLabel("Etiqueta 2");
        JButton boton3 = new JButton("Boton 3");
        JButton boton4 = new JButton("Boton 4");
        ventana.add(boton1);
        ventana.add(boton2);
        ventana.add(label1);
        ventana.add(label2);
        ventana.add(boton3);
        ventana.add(boton4);
        
        configurarVentana(ventana);                
    }
}
