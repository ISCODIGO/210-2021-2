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
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author enrique
 */
public class Ejercicio10b extends JFrame implements ActionListener, MouseListener, MouseMotionListener {

    // Atributos
    private boolean bandera = false;
    private int x1;
    private int x2;
    private int y1;
    private int y2;
    private Color colorLinea;
    final int ANCHURA = 400;
    final int ALTURA = 400;
    // Atributos componentes
    JMenuBar menu;
    JMenu menuArchivo;
    JMenuItem menuSalir;
    JMenu menuColor;
    JMenuItem[] menuItemColores;
    String[] nombreColores;

    public Ejercicio10b() {
        super("Ejercicio 10: Dibujar lineas");

        colorLinea = Color.BLACK;

        nombreColores = new String[]{
            "Rojo", "Verde", "Amarillo", "Azul", "Negro", "Blanco", "Cyan",
            "Magenta"
        };

        menu = new JMenuBar();
        menuArchivo = new JMenu("Archivo");
        menuColor = new JMenu("Elegir color", false);
        menuSalir = new JMenuItem("Salir");

        menuItemColores = new JMenuItem[nombreColores.length];
        for (int i = 0; i < menuItemColores.length; i++) {
            menuItemColores[i] = new JMenuItem(nombreColores[i]);
            menuItemColores[i].addActionListener(this);
            menuColor.add(menuItemColores[i]);
        }

        menuArchivo.add(menuColor);
        menuArchivo.addSeparator();
        menuArchivo.add(menuSalir);
        menu.add(menuArchivo);
        this.setJMenuBar(menu);

        this.addMouseListener(this);
    }

    public void dibujar() {
        this.setSize(ANCHURA, ALTURA);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        java.awt.EventQueue.invokeLater(() -> {
            this.setVisible(true);
        });
    }

    public void crearPuntoConMouse(Point p, MouseEvent e) {
        p = new Point(e.getX(), e.getY());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object objeto = e.getSource();

        // Con instanceof se puede probar a que Clase pertenece un objeto dado.
        if (objeto instanceof JMenuItem) {
            JMenuItem item = (JMenuItem) objeto;
            switch (item.getText()) {
                case "Rojo" ->
                    colorLinea = Color.RED;
                case "Verde" ->
                    colorLinea = Color.GREEN;
                case "Amarillo" ->
                    colorLinea = Color.YELLOW;
                case "Azul" ->
                    colorLinea = Color.BLUE;
                case "Negro" ->
                    colorLinea = Color.BLACK;
                case "Blanco" ->
                    colorLinea = Color.WHITE;
                case "Cyan" ->
                    colorLinea = Color.CYAN;
                case "Magenta" ->
                    colorLinea = Color.MAGENTA;
                case "Salir" ->
                    System.exit(0);
            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        if (bandera) {
            x2 = e.getX();
            y2 = e.getY();
            Graphics g = this.getGraphics();
            g.setColor(colorLinea);
            g.drawLine(x1, y1, x2, y2);
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

    @Override
    public void mouseDragged(MouseEvent e) {
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }

    public static void main(String[] args) {
        Ejercicio10b ejercicio = new Ejercicio10b();
        ejercicio.dibujar();
    }

}
