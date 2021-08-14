/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana8;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPanel;

/**
 *
 * @author enrique
 */
public class Canvas extends JPanel implements MouseListener {
    // Para tener una clasificacion propia de elementos que necesitan tener un
    // valor especifico (sin que realmente sea importante ese valor sino lo que
    // representa, puede utilizar el enum. Este puede ir dentro de una clase o
    // puede estar en un archivo aparte.
    public enum EFormas {
        LINEA, RECTANGULO, OVALO
    }
    
    // Atribut enum
    public EFormas forma;
    public Color color;
    
    // Atributos
    private boolean bandera = false;
    private int x1;
    private int x2;
    private int y1;
    private int y2;

    public Canvas() {
        super();
        
        forma = EFormas.LINEA;
        color = Color.BLACK;
        bandera = false;
        
        this.addMouseListener(this);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g); //To change body of generated methods, choose Tools | Templates.
        
        g.setColor(color);
        // En los casos de figuras en 2D debe revisarse que se muestren 
        // de una forma pertinente.
        int x2D = Math.min(x1, x2);
        int y2D = Math.min(y1, y2);
        int width2D = Math.abs(x2 - x1);
        int height2D = Math.abs(y2 - y1);

        switch (forma) {
            case LINEA ->
                g.drawLine(x1, y1, x2, y2);
            case OVALO ->
                g.drawOval(x2D, y2D, width2D, height2D);
            case RECTANGULO ->
                g.drawRect(x2D, y2D, width2D, height2D);
        }
        g.dispose();
    }
    

    /*@Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); //To change body of generated methods, choose Tools | Templates.
        
        g.setColor(color);
        // En los casos de figuras en 2D debe revisarse que se muestren 
        // de una forma pertinente.
        int x2D = Math.min(x1, x2);
        int y2D = Math.min(y1, y2);
        int width2D = Math.abs(x2 - x1);
        int height2D = Math.abs(y2 - y1);

        switch (forma) {
            case LINEA ->
                g.drawLine(x1, y1, x2, y2);
            case OVALO ->
                g.drawOval(x2D, y2D, width2D, height2D);
            case RECTANGULO ->
                g.drawRect(x2D, y2D, width2D, height2D);
        }
    }*/
    
    public void limpiar() {
        super.paintComponent(this.getGraphics());
    }
                   
    
    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        Graphics g = getGraphics();

        if (bandera) {
            x2 = e.getX();
            y2 = e.getY();

            repaint();
        } else {
            x1 = e.getX();
            y1 = e.getY();
        }

        System.out.println(bandera);
        bandera = !bandera;
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
    
}
