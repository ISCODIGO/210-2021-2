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
public class Login extends JFrame {
    // atributos
    private JButton btnEntrar;
    private JLabel lblUsuario;
    private JLabel lblPassword;
    private JTextField txtUsuario;
    private JPasswordField txtPassword;
    private JPanel panel;
    
    // funcion constructora
    public Login(String titulo) {
        // Inicializando los elementos propios de JFrame (clase de la cual heredamos)
        super(titulo);
        // Inicializacion propia
        btnEntrar = new JButton("Entrar");
        lblUsuario = new JLabel("Usuario:");
        lblPassword = new JLabel("Clave:");
        txtUsuario = new JTextField(10);
        txtPassword = new JPasswordField(10);
        panel = new JPanel(new GridBagLayout());
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout(10, 10));
        this.add(panel, BorderLayout.CENTER);
        
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
        constraints.gridx = 1;
        constraints.gridy = 2;
        panel.add(btnEntrar, constraints);
        
        lblUsuario.setLabelFor(txtUsuario);
        lblPassword.setLabelFor(txtPassword);
        

        //this.pack();
        this.setSize(500, 300);
        this.setVisible(true);
    }
    
    public static void main(String[] args) {
        Login ventana = new Login("Acceso");
    }
    
}

