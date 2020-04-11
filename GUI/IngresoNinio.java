
package GUI;

import Control.IrIngresoTutorActionListener;
import javax.swing.JButton;


public class IngresoNinio extends IngresoFrame {
    private JButton ingresar;
    private JButton cambiarCuenta;
    
    public IngresoNinio(){
        super();
        initComponents();
    }
    
    public void initComponents(){
        ingresar = new JButton("Ingresar");
        ingresar.setSize(200, 25);
        ingresar.setLocation(50, 200);
        cambiarCuenta = new JButton("Ingresar como tutor");
        cambiarCuenta.setSize(200, 25);
        cambiarCuenta.setLocation(50, 235);
        super.contenedor.add(ingresar);
        super.contenedor.add(cambiarCuenta);
        cambiarCuenta.addActionListener(
                new IrIngresoTutorActionListener(this)
        );
        this.setVisible(true);
    }
    
}
