
package GUI;

import Control.IrIngresoNinioActionListener;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;


public class IngresoTutor extends IngresoFrame {
    private JPasswordField contrasenia;
    private JButton ingresar;
    private JButton cambiarCuenta;
    private Container contenedor;
    
    public IngresoTutor(){
        super();
        initComponents();
    }
    
    private void initComponents(){
        contenedor = super.getContenedor();
        JLabel etiqueta = new JLabel("Contaseña");
        etiqueta.setSize(200, 25);
        etiqueta.setLocation(50, 170);
        etiqueta.setFont(new Font("Ubuntu", 0, 20));
        etiqueta.setForeground(new Color(255, 255, 255));
        contrasenia = new JPasswordField();
        contrasenia.setSize(200, 30);
        contrasenia.setLocation(50, 205);
        contrasenia.setFont(new Font("Ubuntu", 0, 20));
        ingresar = new JButton("Ingresar");
        ingresar.setSize(200, 30);
        ingresar.setLocation(50, 245);
        ingresar.setBackground(new Color(47, 55, 74));
        ingresar.setForeground(new Color(255, 255, 255));
        ingresar.setBorder(null);
        ingresar.setFont(new Font("Ubuntu", 0, 20));
        cambiarCuenta = new JButton("Ingresar como niño");
        cambiarCuenta.setSize(200, 30);
        cambiarCuenta.setLocation(50, 280);
        cambiarCuenta.setBackground(new Color(47, 55, 74));
        cambiarCuenta.setForeground(new Color(255, 255, 255));
        cambiarCuenta.setBorder(null);
        cambiarCuenta.setFont(new Font("Ubuntu", 0, 20));
        contenedor.add(etiqueta);
        contenedor.add(contrasenia);
        contenedor.add(ingresar);
        contenedor.add(cambiarCuenta);
        cambiarCuenta.addActionListener(
                new IrIngresoNinioActionListener(this)
        );
    }
    
    @Override
    public void destruir(){
        super.destruir();
        if(contrasenia!=null){
            contrasenia=null;
        }
        if(ingresar!=null){
            ingresar=null;
        }
        if(cambiarCuenta!=null){
            cambiarCuenta=null;
        }
        if(contenedor!=null){
            contenedor=null;
        }
        System.gc();
    }
    
}
