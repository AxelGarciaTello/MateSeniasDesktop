
package GUI;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class IngresoFrame extends JFrame{
    private JTextField nombreUsuario;
    private Container contenedor;
    
    public IngresoFrame(){
        super("Iniciar sesion");
        initComponents();
    }
    
    private void initComponents(){
        this.setSize(300, 500);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setIconImage(
                new ImageIcon(
                        getClass().getResource("Iconos/Icono.png")
                ).getImage()
        );
        JLabel etiqueta = new JLabel("Iniciar sesion.");
        etiqueta.setSize(225,25);
        etiqueta.setLocation(40, 15);
        etiqueta.setFont(new Font("Ubuntu", 0, 35));
        etiqueta.setForeground(new Color(255, 255, 255));
        nombreUsuario = new JTextField();
        nombreUsuario.setSize(200, 30);
        nombreUsuario.setLocation(50, 135);
        nombreUsuario.setFont(new Font("Ubuntu", 0, 20));
        contenedor = this.getContentPane();
        contenedor.setBackground(new Color(56, 87, 35));
        contenedor.setLayout(null);
        contenedor.add(etiqueta);
        contenedor.add(nombreUsuario);
    }
    
    public void destruir(){
        if(nombreUsuario!=null){
            nombreUsuario=null;
        }
        if(contenedor!=null){
            contenedor=null;
        }
        System.gc();
    }
    
    public Container getContenedor(){
        return contenedor;
    }
    
    public JTextField getNombreUsuario(){
        return nombreUsuario;
    }
    
}
