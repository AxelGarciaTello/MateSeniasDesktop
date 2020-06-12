
package GUI;

import Control.IngresarTutorActionListener;
import Control.IrIngresoNinioActionListener;
import Control.IrRegistroTutorActionListener;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;


public class IngresoTutor extends IngresoFrame {
    private JPasswordField contrasenia;
    private JButton ingresar,
                    registrar,
                    cambiarCuenta;
    private Container contenedor;
    
    public IngresoTutor(){
        super();
        initComponents();
    }
    
    private void initComponents(){
        contenedor = super.getContenedor();
        JLabel[] etiqueta = new JLabel[2];
        etiqueta[0] = new JLabel("Correo de usuario.");
        etiqueta[0].setSize(200,25);
        etiqueta[0].setLocation(50, 100);
        etiqueta[0].setFont(new Font("Ubuntu", 0, 20));
        etiqueta[0].setForeground(new Color(255, 255, 255));
        etiqueta[1] = new JLabel("Contraseña");
        etiqueta[1].setSize(200, 25);
        etiqueta[1].setLocation(50, 170);
        etiqueta[1].setFont(new Font("Ubuntu", 0, 20));
        etiqueta[1].setForeground(new Color(255, 255, 255));
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
        registrar = new JButton("Registrarse");
        registrar.setSize(200, 30);
        registrar.setLocation(50, 280);
        registrar.setBackground(new Color(47, 55, 74));
        registrar.setForeground(new Color(255, 255, 255));
        registrar.setBorder(null);
        registrar.setFont(new Font("Ubuntu", 0, 20));
        cambiarCuenta = new JButton("Ingresar como niño");
        cambiarCuenta.setSize(200, 30);
        cambiarCuenta.setLocation(50, 315);
        cambiarCuenta.setBackground(new Color(47, 55, 74));
        cambiarCuenta.setForeground(new Color(255, 255, 255));
        cambiarCuenta.setBorder(null);
        cambiarCuenta.setFont(new Font("Ubuntu", 0, 20));
        contenedor.add(etiqueta[0]);
        contenedor.add(etiqueta[1]);
        contenedor.add(contrasenia);
        contenedor.add(ingresar);
        contenedor.add(registrar);
        contenedor.add(cambiarCuenta);
        ingresar.addActionListener(
                new IngresarTutorActionListener(
                        this, super.getNombreUsuario(), contrasenia
                )
        );
        cambiarCuenta.addActionListener(
                new IrIngresoNinioActionListener(this)
        );
        registrar.addActionListener(new IrRegistroTutorActionListener(this)
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
        if(registrar!=null){
            registrar=null;
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
