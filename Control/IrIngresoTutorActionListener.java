
package Control;

import GUI.IngresoTutor;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class IrIngresoTutorActionListener implements ActionListener {
    private Frame ventana;
    
    public IrIngresoTutorActionListener(Frame ventana){
        this.ventana=ventana;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        IngresoTutor tutor = new IngresoTutor();
        ventana.dispose();
    }
    
}
