
package GUI;

import Control.IngresarNinioActionListener;
import Control.IrIngresoTutorActionListener;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;


public class IngresoNinio extends IngresoFrame {
    private JButton ingresar,
                    cambiarCuenta;
    private Container contenedor;
    
    public IngresoNinio(){
        super();
        initComponents();
    }
    
    private void initComponents(){
        contenedor = super.getContenedor();
        JLabel etiqueta = new JLabel("Nombre de usuario.");
        etiqueta.setSize(200,25);
        etiqueta.setLocation(50, 100);
        etiqueta.setFont(new Font("Ubuntu", 0, 20));
        etiqueta.setForeground(new Color(255, 255, 255));
        ingresar = new JButton("Ingresar");
        ingresar.setSize(200, 30);
        ingresar.setLocation(50, 200);
        ingresar.setBackground(new Color(47, 55, 74));
        ingresar.setForeground(new Color(255, 255, 255));
        ingresar.setBorder(null);
        ingresar.setFont(new Font("Ubuntu", 0, 20));
        cambiarCuenta = new JButton("Ingresar como tutor");
        cambiarCuenta.setSize(200, 30);
        cambiarCuenta.setLocation(50, 235);
        cambiarCuenta.setBackground(new Color(47, 55, 74));
        cambiarCuenta.setForeground(new Color(255, 255, 255));
        cambiarCuenta.setBorder(null);
        cambiarCuenta.setFont(new Font("Ubuntu", 0, 20));
        contenedor.add(etiqueta);
        contenedor.add(ingresar);
        contenedor.add(cambiarCuenta);
        ingresar.addActionListener(
                new IngresarNinioActionListener(this)
        );
        cambiarCuenta.addActionListener(
                new IrIngresoTutorActionListener(this)
        );
    }
    
    @Override
    public void destruir(){
        super.destruir();
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
