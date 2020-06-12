
package GUI;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class RegistroFrame extends JFrame {
    private JTextField nombre,
                       correo;
    private JPasswordField contrasenia,
                           confirmacion;
    private Container contenedor;
    
    public RegistroFrame(){
        super("Registrate");
        initComponents();
    }
    
    private void initComponents(){
        int a=0,
            x=80;
        this.setSize(300, 500);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setIconImage(
                new ImageIcon(
                        getClass().getResource("Iconos/Icono.png")
                ).getImage()
        );
        contenedor = this.getContentPane();
        contenedor.setBackground(new Color(56, 87, 35));
        contenedor.setLayout(null);
        JLabel titulo = new JLabel("Registrate");
        titulo.setSize(300, 40);
        titulo.setLocation(0, 5);
        titulo.setFont(new Font("Ubuntu", 0, 35));
        titulo.setForeground(new Color(255, 255, 255));
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        titulo.setVerticalAlignment(SwingConstants.CENTER);
        contenedor.add(titulo);
        JLabel[] etiquetas = new JLabel[4];
        etiquetas[0] = new JLabel("Nombre");
        etiquetas[1] = new JLabel("Correo electronico");
        etiquetas[2] = new JLabel("Contraseña");
        etiquetas[3] = new JLabel("Confirmar contraseña");
        for(a=0; a<4; a++){
            etiquetas[a].setSize(240, 30);
            etiquetas[a].setLocation(30, x);
            x+=70;
            etiquetas[a].setFont(new Font("Ubuntu", 0, 20));
            etiquetas[a].setForeground(new Color(255, 255, 255));
            contenedor.add(etiquetas[a]);
        }
        nombre = new JTextField();
        nombre.setSize(240, 30);
        nombre.setLocation(30, 115);
        nombre.setFont(new Font("Ubuntu", 0, 20));
        contenedor.add(nombre);
        correo = new JTextField();
        correo.setSize(240, 30);
        correo.setLocation(30, 185);
        correo.setFont(new Font("Ubuntu", 0, 20));
        contenedor.add(correo);
        contrasenia = new JPasswordField();
        contrasenia.setSize(240, 30);
        contrasenia.setLocation(30, 255);
        contrasenia.setFont(new Font("Ubuntu", 0, 20));
        contenedor.add(contrasenia);
        confirmacion = new JPasswordField();
        confirmacion.setSize(240, 30);
        confirmacion.setLocation(30, 325);
        confirmacion.setFont(new Font("Ubuntu", 0, 20));
        contenedor.add(confirmacion);
    }
    
    public void destruir(){
        if(nombre!=null){
            nombre=null;
        }
        if(correo!=null){
            correo=null;
        }
        if(contrasenia!=null){
            contrasenia=null;
        }
        if(confirmacion!=null){
            confirmacion=null;
        }
        if(contenedor!=null){
            contenedor=null;
        }
        System.gc();
    }
    
    public void agregar(Component objeto){
        contenedor.add(objeto);
    }
    
    public JTextField getNombre(){
        return nombre;
    }
    
    public JTextField getCorreo(){
        return correo;
    }
    
    public JPasswordField getContrasenia(){
        return contrasenia;
    }
    
    public JPasswordField getConfirmacion(){
        return confirmacion;
    }
    
    public void bloquearCorreo(){
        correo.setEditable(false);
    }
}
