/*
Desarrolle un [JFrame] para trazar líneas. El usuario puede elegir los puntos de inicio y
final de la línea que se trazará haciendo clic con el ratón.

1. Dibujar linea.
Clase Graphics
    -> drawLine(x1, y1, x2, y2)

2. Con el clic del raton definir puntos (inicio, final).
    -> Que evento puedo usar con el clic del mouse????
        MouseListener::mouseClicked

3. Como saber cuando estamos 'clicando' al punto inicial y cuando lo hacemos con
el punto final.
    -> Colocar un contador 0: inicio /  1: final

 */
package semana8;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author enrique
 */
public class Ejercicio10 {

    // Forma 2 de colocar un elemento en main: Definir el elemento como static
    static boolean bandera = false;
    static Point punto1;
    static Point punto2;
    static Color color;

    public static void crearPuntoConMouse(Point p, MouseEvent e) {
        p.x = e.getX();
        p.y = e.getY();
    }

    public static void main(String[] args) {
        final int ANCHURA = 400;
        final int ALTURA = 400;
        
        color = Color.BLACK;

        // Forma 1 de colocar un elemento en main: Instanciar una clase (crear un objeto)
        JFrame ventana = new JFrame();
        JMenuBar menu = new JMenuBar();
        JMenu menuArchivo = new JMenu("Archivo");
        JMenuItem menuSalir = new JMenuItem("Salir");
        JMenu menuColor = new JMenu("Elegir color", false);
        JMenuItem[] menuColores = new JMenuItem[5];
        menuColores[0] = new JMenuItem("Rojo");
        menuColores[1] = new JMenuItem("Verde");
        menuColores[2] = new JMenuItem("Amarillo");
        menuColores[3] = new JMenuItem("Azul");
        menuColores[4] = new JMenuItem("Negro");

        for (int i = 0; i < menuColores.length; i++) {
            menuColor.add(menuColores[i]);
        }

        menuArchivo.add(menuColor);
        menuArchivo.addSeparator();
        menuArchivo.add(menuSalir);
        menu.add(menuArchivo);
        ventana.setJMenuBar(menu);

        ventana.setSize(ANCHURA, ALTURA);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);

        punto1 = new Point();
        punto2 = new Point();

        ventana.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (bandera) {
                    crearPuntoConMouse(punto2, e);

                    Graphics g = ventana.getGraphics();
                    g.setColor(color);
                    g.drawLine(punto1.x, punto1.y, punto2.x, punto2.y);
                } else {
                    crearPuntoConMouse(punto1, e);
                }

                System.out.println(bandera);
                bandera = !bandera;

            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });

        menuSalir.addActionListener((ActionEvent e) -> {
            System.exit(0);
        });
                

        for (int i = 0; i < menuColores.length; i++) {
            menuColores[i].addActionListener((ActionEvent e) -> {
                // quien genero el evento
                JMenuItem item = (JMenuItem) e.getSource();                
                String texto = item.getText();

                switch (texto) {
                    case "Rojo" -> color = Color.red;
                    case "Verde" -> color = Color.GREEN;
                    case "Amarillo" -> color = Color.yellow;
                    case "Azul" -> color = Color.BLUE;
                    case "Negro" -> color = Color.BLACK;
                }
            });
        }
    }

}
