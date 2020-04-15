
package GUI;

import Control.IngresarNinioActionListener;
import Control.IrIngresoTutorActionListener;
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
        ingresar.setSize(200, 25);
        ingresar.setLocation(50, 200);
        cambiarCuenta = new JButton("Ingresar como tutor");
        cambiarCuenta.setSize(200, 25);
        cambiarCuenta.setLocation(50, 235);
        super.contenedor.add(ingresar);
        super.contenedor.add(cambiarCuenta);
        ingresar.addActionListener(
                new IngresarNinioActionListener(this)
        );
        cambiarCuenta.addActionListener(
                new IrIngresoTutorActionListener(this)
        );
    }
    
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
