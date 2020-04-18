
package Control;

import GUI.OpcionesFrame;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;


public class VerOpcionesActionListener implements ActionListener {
    private JButton boton;
    
    public VerOpcionesActionListener(JButton boton){
        this.boton=boton;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Point punto=MouseInfo.getPointerInfo().getLocation();
        int x=punto.x,
            y=punto.y;
        OpcionesFrame opciones = new OpcionesFrame(x,y,boton);
        opciones.setVisible(true);
    }
    
}
