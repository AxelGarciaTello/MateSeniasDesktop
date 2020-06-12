
package Control;

import GUI.IngresoTutor;
import GUI.RegistroFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;


public class IrRegistroActionListener implements ActionListener {
    private JFrame ventana;
    
    public IrRegistroActionListener(JFrame ventana){
        this.ventana=ventana;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        RegistroFrame registro = new RegistroFrame();
        registro.setVisible(true);
        if(ventana instanceof IngresoTutor){
            ((IngresoTutor)ventana).destruir();
        }
        ventana.dispose();
    }
    
}
