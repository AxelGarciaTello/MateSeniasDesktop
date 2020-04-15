
package Control;

import GUI.IngresoNinio;
import GUI.IngresoTutor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;


public class IrIngresoTutorActionListener implements ActionListener {
    private JFrame ventana;
    
    public IrIngresoTutorActionListener(JFrame ventana){
        this.ventana=ventana;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        IngresoTutor tutor = new IngresoTutor();
        tutor.setVisible(true);
        if(ventana instanceof IngresoNinio){
            ((IngresoNinio)ventana).destruir();
        }
        ventana.dispose();
    }
    
}
