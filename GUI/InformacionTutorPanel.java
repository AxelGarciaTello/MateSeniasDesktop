
package GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class InformacionTutorPanel extends JPanel{
    private JTextField nombre;
    private JTextField correo;
    private JPasswordField contrasenia;
    private JPasswordField nuevaContrasenia;
    private JPasswordField confirmacion;
    private JButton editar;
    private JButton eliminar;
    private JButton guardar;
    private JButton cancelar;
    
    public InformacionTutorPanel(){
        initComponents();
    }
    
    private void initComponents(){
        int a=0;
        this.setBackground(new Color(56, 87, 35));
        this.setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx=0;
        constraints.gridy=0;
        constraints.gridwidth=1;
        constraints.gridheight=1;
        constraints.fill=GridBagConstraints.BOTH;
        constraints.weightx=1.0;
        constraints.weighty=1.0;
        JLabel[] margen= new JLabel[5];
        margen[0] = new JLabel();
        margen[0].setSize(50, 40);
        this.add(margen[0], constraints);
        margen[1] = new JLabel();
        margen[1].setSize(50, 40);
        constraints.gridx=3;
        this.add(margen[1], constraints);
        JLabel titulo = new JLabel("Información");
        titulo.setFont(new Font("Ubuntu", 0, 35));
        titulo.setForeground(new Color(255, 255, 255));
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        titulo.setVerticalAlignment(SwingConstants.CENTER);
        constraints.gridx=1;
        constraints.gridwidth=2;
        this.add(titulo, constraints);
        JLabel[] etiquetas = new JLabel[5];
        etiquetas[0] = new JLabel("Nombre");
        etiquetas[1] = new JLabel("Correo");
        etiquetas[2] = new JLabel("Contraseña   ");
        etiquetas[3] = new JLabel("Nueva contraseña");
        etiquetas[4] = new JLabel("Confirmar contraseña   ");
        constraints.weightx=0.0;
        constraints.gridwidth=1;
        for(a=0; a<5; a++){
            etiquetas[a].setFont(new Font("Ubuntu", 0, 20));
            etiquetas[a].setForeground(new Color(255, 255, 255));
            constraints.gridy=a+1;
            this.add(etiquetas[a], constraints);
        }
        nombre = new JTextField();
        nombre.setFont(new Font("Ubuntu", 0, 20));
        constraints.gridx=2;
        constraints.gridy=1;
        constraints.fill=GridBagConstraints.HORIZONTAL;
        this.add(nombre, constraints);
        correo = new JTextField();
        correo.setFont(new Font("Ubuntu", 0, 20));
        constraints.gridy+=1;
        this.add(correo, constraints);
        contrasenia = new JPasswordField();
        contrasenia.setFont(new Font("Ubuntu", 0, 20));
        constraints.gridy+=1;
        this.add(contrasenia, constraints);
        nuevaContrasenia = new JPasswordField();
        nuevaContrasenia.setFont(new Font("Ubuntu", 0, 20));
        constraints.gridy+=1;
        this.add(nuevaContrasenia, constraints);
        confirmacion = new JPasswordField();
        confirmacion.setFont(new Font("Ubuntu", 0, 20));
        constraints.gridy+=1;
        this.add(confirmacion, constraints);
        constraints.gridwidth=2;
        constraints.gridx=1;
        constraints.fill=GridBagConstraints.BOTH;
        margen[2] = new JLabel();
        constraints.gridy+=1;
        this.add(margen[2], constraints);
        margen[3] = new JLabel();
        constraints.gridy+=1;
        this.add(margen[3], constraints);
        constraints.fill=GridBagConstraints.HORIZONTAL;
        editar = new JButton("Editar");
        editar.setFont(new Font("Ubuntu", 0, 20));
        editar.setBorder(null);
        editar.setBackground(new Color(47, 55, 74));
        editar.setForeground(new Color(255, 255, 255));
        constraints.gridy+=1;
        this.add(editar, constraints);
        eliminar = new JButton("Eliminar cuenta");
        eliminar.setFont(new Font("Ubuntu", 0, 20));
        eliminar.setBorder(null);
        eliminar.setBackground(new Color(227, 66, 51));
        eliminar.setForeground(new Color(255, 255, 255));
        constraints.gridy+=1;
        this.add(eliminar, constraints);
        guardar = new JButton("Guardar");
        guardar.setFont(new Font("Ubuntu", 0, 20));
        guardar.setBorder(null);
        guardar.setBackground(new Color(47, 55, 74));
        guardar.setForeground(new Color(255, 255, 255));
        constraints.gridy+=1;
        this.add(guardar, constraints);
        cancelar = new JButton("Cancelar");
        cancelar.setFont(new Font("Ubuntu", 0, 20));
        cancelar.setBorder(null);
        cancelar.setBackground(new Color(47, 55, 74));
        cancelar.setForeground(new Color(255, 255, 255));
        constraints.gridy+=1;
        this.add(cancelar, constraints);
        constraints.fill=GridBagConstraints.BOTH;
        margen[4] = new JLabel();
        margen[4].setSize(100, 500);
        constraints.gridy+=1;
        this.add(margen[4], constraints);
        etiquetas[3].setVisible(false);
        etiquetas[4].setVisible(false);
        nombre.setEditable(false);
        correo.setEditable(false);
        contrasenia.setEditable(false);
        nuevaContrasenia.setVisible(false);
        confirmacion.setVisible(false);
        guardar.setVisible(false);
        cancelar.setVisible(false);
    }
    
}
