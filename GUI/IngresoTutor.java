
package GUI;

import Control.IrIngresoNinioActionListener;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;


public class IngresoTutor extends IngresoFrame {
    private JPasswordField contrasenia;
    private JButton ingresar;
    private JButton cambiarCuenta;
    
    public IngresoTutor(){
        super();
        initComponents();
    }
    
    private void initComponents(){
        JLabel etiqueta = new JLabel("Contaseña");
        etiqueta.setSize(200, 25);
        etiqueta.setLocation(50, 170);
        etiqueta.setFont(new Font("Ubuntu", 0, 20));
        etiqueta.setForeground(new Color(255, 255, 255));
        contrasenia = new JPasswordField();
        contrasenia.setSize(200, 25);
        contrasenia.setLocation(50, 205);
        ingresar = new JButton("Ingresar");
        ingresar.setSize(200, 25);
        ingresar.setLocation(50, 245);
        cambiarCuenta = new JButton("Ingresar como niño");
        cambiarCuenta.setSize(200, 25);
        cambiarCuenta.setLocation(50, 275);
        super.contenedor.add(etiqueta);
        super.contenedor.add(contrasenia);
        super.contenedor.add(ingresar);
        super.contenedor.add(cambiarCuenta);
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
        System.gc();
    }
    
}
