/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana6;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author enrique
 */
public class Login extends JFrame implements ActionListener {

    // atributos
    private JButton btnEntrar;
    private JButton btnRegistrar;
    private JLabel lblUsuario;
    private JLabel lblPassword;
    private JLabel lblClase;
    private JTextField txtUsuario;
    private JPasswordField txtPassword;
    private JPanel panel;
    private JPanel panelBoton;

    // funcion constructora
    public Login(String titulo) {
        // Inicializando los elementos propios de JFrame (clase de la cual heredamos)
        super(titulo);
        // Inicializacion propia
        btnEntrar = new JButton("Entrar");
        btnRegistrar = new JButton("Registrar");
        lblUsuario = new JLabel("Usuario:");
        lblPassword = new JLabel("Clave:");
        txtUsuario = new JTextField(15);
        txtPassword = new JPasswordField(15);
        panel = new JPanel(new GridBagLayout());
        lblClase = new JLabel("Clase: Programacion II");
        panelBoton = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout(10, 10));
        this.add(panel, BorderLayout.CENTER);
        this.add(lblClase, BorderLayout.SOUTH);

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 0;
        panel.add(lblUsuario, constraints);
        constraints.gridx = 1;
        constraints.gridy = 0;
        panel.add(txtUsuario, constraints);
        constraints.gridx = 0;
        constraints.gridy = 1;
        panel.add(lblPassword, constraints);
        constraints.gridx = 1;
        constraints.gridy = 1;
        panel.add(txtPassword, constraints);
        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 2;
        panel.add(panelBoton, constraints);

        panelBoton.add(btnEntrar);
        panelBoton.add(btnRegistrar);

        lblUsuario.setLabelFor(txtUsuario);
        lblPassword.setLabelFor(txtPassword);

        btnEntrar.addActionListener(this);
        btnRegistrar.addActionListener(this);
        
        // ActionListener funciona a nivel de componente
        txtUsuario.addActionListener((ActionEvent e) -> {
            txtPassword.setFocusable(true);
            txtPassword.requestFocus();
        });

        //this.pack();
        this.setSize(500, 300);
        this.setVisible(true);
    }

    public boolean autenticar(String usuario, String password) {
        if (usuario.equals("admin") && password.equals("1234")) {
            return true;
        }

        return false;
    }

    public void pasarVentanaSecreta() {
        boolean puedeIngresar = autenticar(txtUsuario.getText(),
                String.valueOf(txtPassword.getPassword()));

        if (puedeIngresar) {
            VentanaSecreta secreto = new VentanaSecreta();
            secreto.mostrar();
            //this.dispose();
        }
    }

    public void pasarVentanaRegistro() {
        Registro registro = new Registro();
        registro.mostrar();
        //this.dispose();
    }

    public static void main(String[] args) {
        Login ventana = new Login("Acceso");
    }

    // El ActionListener funciona a nivel de toda la ventana (concentra la escucha)
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton btn = (JButton) e.getSource();

        if ("Entrar".equals(btn.getText())) {
            pasarVentanaSecreta();
        } else if ("Registrar".equals(btn.getText())) {
            pasarVentanaRegistro();
        }
    }

}
