
package Control;

import GUI.IngresoNinio;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class IrIngresoNinioActionListener implements ActionListener {
    private Frame ventana;
    
    public IrIngresoNinioActionListener(Frame ventana){
        this.ventana=ventana;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        IngresoNinio ninio = new IngresoNinio();
        ventana.dispose();
    }
    
}
