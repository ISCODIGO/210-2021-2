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
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author enrique
 */
public class Ejercicio10b extends JFrame implements ActionListener {



    // Atributos constantes
    final int ANCHURA = 400;
    final int ALTURA = 400;

    // Atributos
    String[] nombreColores;
    String[] nombreFormas;
    Color colorLinea;
    Canvas.EFormas forma;

    // Atributos componentes
    JMenuBar menu;
    JMenu menuArchivo;
    JMenuItem menuItemLimpiar;
    JMenuItem menuSalir;
    JMenu menuColor;
    JMenuItem[] menuItemColores;
    JMenu menuForma;
    JMenuItem[] menuItemFormas;
    Canvas canva;

    public Ejercicio10b() {
        super("Ejercicio 10: Dibujar lineas");

        nombreColores = new String[]{
            "Rojo", "Verde", "Amarillo", "Azul", "Negro", "Blanco", "Cyan",
            "Magenta"
        };

        nombreFormas = new String[]{
            "Linea", "Ovalo", "Rectangulo"
        };

        menu = new JMenuBar();
        this.setJMenuBar(menu);

        menuArchivo = new JMenu("Archivo");
        menu.add(menuArchivo);

        menuColor = new JMenu("Elegir color", false);
        menuArchivo.add(menuColor);

        menuItemColores = new JMenuItem[nombreColores.length];
        for (int i = 0; i < menuItemColores.length; i++) {
            menuItemColores[i] = new JMenuItem(nombreColores[i]);
            menuItemColores[i].addActionListener(this);
            menuColor.add(menuItemColores[i]);
        }

        menuForma = new JMenu("Formas");
        menuArchivo.add(menuForma);

        menuItemFormas = new JMenuItem[nombreFormas.length];
        for (int i = 0; i < menuItemFormas.length; i++) {
            menuItemFormas[i] = new JMenuItem(nombreFormas[i]);
            menuItemFormas[i].addActionListener(this);
            menuForma.add(menuItemFormas[i]);
        }

        menuItemLimpiar = new JMenuItem("Limpiar pantalla");
        menuItemLimpiar.addActionListener(this);
        menuArchivo.add(menuItemLimpiar);

        menuArchivo.addSeparator();

        menuSalir = new JMenuItem("Salir");
        menuSalir.addActionListener(this);
        menuArchivo.add(menuSalir);

        //  Para evitar algunos inconvenientes en el dibujado de graficos
        canva = new Canvas();
        this.add(canva);

    }

    public void dibujar() {
        this.setSize(ANCHURA, ALTURA);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        java.awt.EventQueue.invokeLater(() -> {
            this.setVisible(true);
        });
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        Object objeto = e.getSource();

        // Con instanceof se puede probar a que Clase pertenece un objeto dado.
        if (objeto instanceof JMenuItem) {
            JMenuItem item = (JMenuItem) objeto;
            switch (item.getText()) {
                case "Rojo" ->
                    canva.color = Color.RED;
                case "Verde" ->
                    canva.color = Color.GREEN;
                case "Amarillo" ->
                    canva.color = Color.YELLOW;
                case "Azul" ->
                    canva.color = Color.BLUE;
                case "Negro" ->
                    canva.color = Color.BLACK;
                case "Blanco" ->
                    canva.color = Color.WHITE;
                case "Cyan" ->
                    canva.color = Color.CYAN;
                case "Magenta" ->
                    canva.color = Color.MAGENTA;
                case "Linea" ->
                    canva.forma = Canvas.EFormas.LINEA;
                case "Ovalo" ->
                    canva.forma = Canvas.EFormas.OVALO;
                case "Rectangulo" ->
                    canva.forma = Canvas.EFormas.RECTANGULO;
                case "Limpiar pantalla" ->
                    canva.limpiar();
                case "Salir" ->
                    System.exit(0);
            }
        }
    }

    public static void main(String[] args) {
        Ejercicio10b ejercicio = new Ejercicio10b();
        ejercicio.dibujar();
    }

}
