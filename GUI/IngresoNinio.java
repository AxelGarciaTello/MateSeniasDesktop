
package GUI;

import Control.IngresarNinioActionListener;
import Control.IrIngresoTutorActionListener;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;


public class IngresoNinio extends IngresoFrame {
    private JButton ingresar;
    private JButton cambiarCuenta;
    
    public IngresoNinio(){
        super();
        initComponents();
    }
    
    private void initComponents(){
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
        super.contenedor.add(ingresar);
        super.contenedor.add(cambiarCuenta);
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
        System.gc();
    }
    
}
