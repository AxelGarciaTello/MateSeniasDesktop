
package Control;

import GUI.IngresoTutor;
import GUI.RegistroTutor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;


public class IrRegistroTutorActionListener implements ActionListener {
    private JFrame ventana;
    
    public IrRegistroTutorActionListener(JFrame ventana){
        this.ventana=ventana;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        RegistroTutor registro = new RegistroTutor();
        registro.setVisible(true);
        if(ventana instanceof IngresoTutor){
            ((IngresoTutor)ventana).destruir();
        }
        ventana.dispose();
    }
    
}
